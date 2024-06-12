package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenUVData {
    @JsonProperty("result")
    private UvInfo uvInfo;

    public UvInfo getUvInfo(){
        return uvInfo;
    }

    public void setResult(UvInfo uvInfo) {
        this.uvInfo = uvInfo;
    }

}
