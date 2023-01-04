/*
 *  (C) Copyright 2023 TheOtherP (theotherp@posteo.net)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.nzbhydra.externalapi;

import org.junit.jupiter.api.Test;
import org.nzbhydra.GenericResponse;
import org.nzbhydra.HydraClient;
import org.nzbhydra.HydraResponse;
import org.nzbhydra.Jackson;
import org.nzbhydra.TestConfig;
import org.nzbhydra.config.downloading.DownloaderConfig;
import org.nzbhydra.downloading.AddFilesRequest;
import org.nzbhydra.downloading.downloaders.AddNzbsResponse;
import org.nzbhydra.downloading.downloaders.DownloaderStatus;
import org.nzbhydra.hydraconfigure.ConfigManager;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration(classes = {TestConfig.class})
public class DownloaderTest {

    @Autowired
    private HydraClient hydraClient;

    @Autowired
    private ConfigManager configManager;

    @Value("${nzbhydra.mockUrl}")
    private String mockUrl;

    @Test
    public void shouldCheckConnection() throws Exception {
        DownloaderConfig config = getDownloaderConfig();
        final String json = Jackson.JSON_MAPPER.writeValueAsString(config);
        final GenericResponse response = hydraClient.post("internalapi/downloader/checkConnection", json).as(GenericResponse.class);
        assertThat(response.isSuccessful()).isTrue();
    }

    private DownloaderConfig getDownloaderConfig() {
        final List<DownloaderConfig> downloaders = configManager.getCurrentConfig().getDownloading().getDownloaders();
        assertThat(downloaders).isNotEmpty();
        DownloaderConfig config = downloaders.get(0);
        return config;
    }

    @Test
    public void shouldGetStatus() throws Exception {
        final HydraResponse response = hydraClient.get("internalapi/downloader/getStatus");
        final DownloaderStatus status = response.as(DownloaderStatus.class);
        assertThat(status.getState()).isEqualTo(DownloaderStatus.State.DOWNLOADING);
    }

    @Test
    public void shouldAddNzb() throws Exception {
        final String guid = findSearchResult();

        DownloaderConfig config = getDownloaderConfig();
        AddFilesRequest addFilesRequest = new AddFilesRequest();
        addFilesRequest.setDownloaderName(config.getName());
        addFilesRequest.setCategory("TV HD");
        addFilesRequest.setSearchResults(Collections.singletonList(new AddFilesRequest.SearchResult(guid, "original", "TV HD")));
        final String addFilesRequestJson = Jackson.JSON_MAPPER.writeValueAsString(addFilesRequest);
        final HydraResponse response = hydraClient.put("internalapi/downloader/addNzbs", addFilesRequestJson);
        final AddNzbsResponse status = response.as(AddNzbsResponse.class);
        assertThat(status.isSuccessful()).isTrue();
    }

    private String findSearchResult() {
        final HydraResponse response = hydraClient.get("/api", "apikey=apikey", "t=search", "q=123");
        final String body = response.body();
        NewznabXmlRoot root = Jackson.getUnmarshal(body);
        final String guid = root.getRssChannel().getItems().get(0).getRssGuid().getGuid();
        return guid;
    }


}
