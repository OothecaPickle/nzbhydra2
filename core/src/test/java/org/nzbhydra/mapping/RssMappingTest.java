package org.nzbhydra.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nzbhydra.mapping.newznab.xml.NewznabAttribute;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlChannel;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlEnclosure;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlGuid;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlItem;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlResponse;
import org.nzbhydra.mapping.newznab.xml.NewznabXmlRoot;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.time.Instant;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RunWith(SpringRunner.class)
public class RssMappingTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMappingFromXml() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("newznab_3results.xml");
        NewznabXmlChannel channel = rssRoot.getRssChannel();
        assertThat(channel.getDescription(), is("indexerName(dot)com Feed"));
        assertThat(channel.getLink(), is("https://indexerName.com/"));
        assertThat(channel.getLanguage(), is("en-gb"));
        assertThat(channel.getWebMaster(), is("admin@indexerName.com (indexerName(dot)com)"));

        NewznabXmlResponse newznabResponse = channel.getNewznabResponse();
        assertThat(newznabResponse.getOffset(), is(0));
        assertThat(newznabResponse.getTotal(), is(1000));

        List<NewznabXmlItem> items = channel.getItems();
        assertThat(items.size(), is(3));

        NewznabXmlItem item = items.get(0);
        assertThat(item.getLink(), is("https://indexerName.com/getnzb/eff551fbdb69d6777d5030c209ee5d4b.nzb&i=1692&r=apikey"));
        assertThat(item.getPubDate(), is(Instant.ofEpochSecond(1444584857)));
        assertThat(item.getDescription(), is("testtitle1"));
        assertThat(item.getComments(), is("https://indexerName.com/details/eff551fbdb69d6777d5030c209ee5d4b#comments"));

        NewznabXmlGuid rssGuid = item.getRssGuid();
        assertThat(rssGuid.getGuid(), is("eff551fbdb69d6777d5030c209ee5d4b"));
        assertThat(rssGuid.isPermaLink(), is(false));

        NewznabXmlEnclosure enclosure = item.getEnclosure();
        assertThat(enclosure.getUrl(), is("https://indexerName.com/getnzb/eff551fbdb69d6777d5030c209ee5d4b.nzb&i=1692&r=apikey"));
        assertThat(enclosure.getLength(), is(2893890900L));

        List<NewznabAttribute> attributes = item.getNewznabAttributes();
        assertThat(attributes.size(), is(6));
        assertThat(attributes.get(0).getName(), is("category"));
        assertThat(attributes.get(0).getValue(), is("7000"));
        assertThat(attributes.get(2).getName(), is("size"));
        assertThat(attributes.get(2).getValue(), is("2893890900"));
        assertThat(attributes.get(3).getName(), is("guid"));
        assertThat(attributes.get(3).getValue(), is("eff551fbdb69d6777d5030c209ee5d4b"));
        assertThat(attributes.get(4).getName(), is("poster"));
        assertThat(attributes.get(4).getValue(), is("chuck@norris.com"));
        assertThat(attributes.get(5).getName(), is("group"));
        assertThat(attributes.get(5).getValue(), is("alt.binaries.mom"));
    }

    @Test
    public void shouldParseResponseFromNzbsOrg() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("nzbsOrgResponse.xml");

        assertEquals(Integer.valueOf(1000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromOmgwtf() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("omgwtfResponse.xml");

        assertEquals(Integer.valueOf(416), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromNzbAG() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("nzbAgResponse.xml");

        assertEquals(Integer.valueOf(125000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromTabulaRasa() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("tabulaRasaResponse.xml");

        assertEquals(Integer.valueOf(125000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromNzbCat() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("nzbCatResponse.xml");

        assertEquals(Integer.valueOf(125000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromDrunkenSlug() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("drunkenSlugResponse.xml");

        assertEquals(Integer.valueOf(125000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromDrunkenSlugWithSomeApilimits() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("drunkenSlug_withSomeLimits.xml");

        assertEquals(Integer.valueOf(44), rssRoot.getRssChannel().getApiLimits().getApiCurrent());
        assertEquals(Integer.valueOf(50), rssRoot.getRssChannel().getApiLimits().getApiMax());
        assertNull(rssRoot.getRssChannel().getApiLimits().getGrabCurrent());
        assertEquals(Integer.valueOf(5), rssRoot.getRssChannel().getApiLimits().getGrabMax());
    }

    @Test
    public void shouldParseResponseFromDrunkenSlugWithApilimits() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("drunkenSlug_withLimits.xml");

        assertEquals(Integer.valueOf(44), rssRoot.getRssChannel().getApiLimits().getApiCurrent());
        assertEquals(Integer.valueOf(50), rssRoot.getRssChannel().getApiLimits().getApiMax());
        assertEquals(Integer.valueOf(1), rssRoot.getRssChannel().getApiLimits().getGrabCurrent());
        assertEquals(Integer.valueOf(5), rssRoot.getRssChannel().getApiLimits().getGrabMax());
        assertNull(rssRoot.getRssChannel().getApiLimits().getApiOldestTime());
        assertNull(rssRoot.getRssChannel().getApiLimits().getGrabOldestTime());
    }

    @Test
    public void shouldParseResponseFromTabulaRasaWithApilimits() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("tabluaRasa_withSomeLimits.xml");

        assertEquals(Integer.valueOf(763), rssRoot.getRssChannel().getApiLimits().getApiCurrent());
        assertEquals(Integer.valueOf(8000), rssRoot.getRssChannel().getApiLimits().getApiMax());
        assertEquals(Integer.valueOf(4), rssRoot.getRssChannel().getApiLimits().getGrabCurrent());
        assertEquals(Integer.valueOf(8001), rssRoot.getRssChannel().getApiLimits().getGrabMax());
        assertEquals("2020-04-30T10:39:38Z", rssRoot.getRssChannel().getApiLimits().getApiOldestTime().toString());
        assertEquals("2020-04-30T17:54:30Z", rssRoot.getRssChannel().getApiLimits().getGrabOldestTime().toString());
    }

    @Test
    public void shouldParseResponseFromNzbFinder() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("nzbFinderResponse.xml");

        assertEquals(Integer.valueOf(125000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromNewztown() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("newztownResponse.xml");

        assertEquals(Integer.valueOf(4443964), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromNzbSu() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("nzbSuResponse.xml");

        assertEquals(Integer.valueOf(20000), rssRoot.getRssChannel().getNewznabResponse().getTotal());
        assertNotNull(rssRoot.getRssChannel().getItems().get(0).getPubDate());
    }

    @Test
    public void shouldParseResponseFromCardigann() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("btnJackettResponse.xml");

        NewznabXmlChannel channel = rssRoot.getRssChannel();
        assertThat(channel.getDescription(), is("Needs no description.."));

        NewznabXmlResponse newznabResponse = channel.getNewznabResponse();
        assertThat(newznabResponse, is(nullValue()));

        List<NewznabXmlItem> items = channel.getItems();
        assertThat(items.size(), is(3));
        NewznabXmlItem item = items.get(0);
        assertThat(item.getTitle(), is("The.Challenge.S30.Special.14.Times.Our.Challengers.Found.Their.Shit.1080p.WEB.x264-CookieMonster"));
        assertThat(item.getRssGuid().getGuid(), is("https://unicasthe.net/torrents.php?action=download&id=799031&authkey=authkey&torrent_pass=torrentPass"));
        assertThat(item.getLink(), startsWith("http://127.0.0.1:9117/dl/unicasthenet/jackettApiKey?path=linkstuff&file=The.Challenge.S30.Special.14.Times.Our.Challengers.Found.Their.Shit.1080p.WEB.x264-CookieMonster.torrent"));
        assertThat(item.getCategory(), is("5000"));
        assertThat(item.getEnclosure().getLength(), is(1459519537L));
        assertThat(item.getTorznabAttributes().size(), is(6));
        assertThat(item.getTorznabAttributes().get(0).getName(), is("rageid"));
        assertThat(item.getTorznabAttributes().get(0).getValue(), is("6126"));
    }

    @Test
    public void shouldParseResponseFromNzbIndex() throws Exception {
        NewznabXmlRoot rssRoot = getRssRootFromXml("nzbIndexResponse.xml");
        assertEquals(100, rssRoot.getRssChannel().getItems().size());
    }


    private NewznabXmlRoot getRssRootFromXml(String xmlFileName) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        MockRestServiceServer mockServer = MockRestServiceServer.createServer(restTemplate);
        mockServer.expect(requestTo("/api")).andRespond(withSuccess(Resources.toString(Resources.getResource(RssMappingTest.class, xmlFileName), Charsets.UTF_8), MediaType.APPLICATION_XML));

        return restTemplate.getForObject("/api", NewznabXmlRoot.class);
    }

    @Test
    public void shouldSerializeToJson() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        NewznabXmlRoot rssRoot = getRssRootFromXml("newznab_3results.xml");
        String json = objectMapper.writeValueAsString(rssRoot);
        System.out.println(json);
    }


}
