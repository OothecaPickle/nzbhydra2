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

package org.nzbhydra;

import org.assertj.core.api.InstanceOfAssertFactory;
import org.nzbhydra.mediainfo.MediaInfoTO;
import org.nzbhydra.mediainfo.MediaInfoTOAssert;

public class AssertFactories {

    public static InstanceOfAssertFactory<MediaInfoTO, MediaInfoTOAssert> MediaInfoTO = new InstanceOfAssertFactory<>(org.nzbhydra.mediainfo.MediaInfoTO.class,
        Assertions::assertThat);
}
