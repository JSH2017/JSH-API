package com.amdocs.jshapi.estudios;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Sirve",
"Tiene"
})
public class Horno {

@JsonProperty("Sirve")
private Boolean sirve;
@JsonProperty("Tiene")
private Boolean tiene;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Sirve")
public Boolean getSirve() {
return sirve;
}

@JsonProperty("Sirve")
public void setSirve(Boolean sirve) {
this.sirve = sirve;
}

@JsonProperty("Tiene")
public Boolean getTiene() {
return tiene;
}

@JsonProperty("Tiene")
public void setTiene(Boolean tiene) {
this.tiene = tiene;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
