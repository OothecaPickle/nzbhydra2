
package org.nzbhydra.mapping.newznab.json.caps;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "max",
        "default"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapsJsonLimitsAttributes {

    @JsonProperty("max")
    private String max;
    @JsonProperty("default")
    private String _default;

}
