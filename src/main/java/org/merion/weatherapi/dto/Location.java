package org.merion.weatherapi.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter //@ToString
public class Location {
    private Double lat;
    private Double lon;
    private String name;
    private String region;
    private String country;
    @SerializedName("tz_id")
    private String tzId;
    @SerializedName("localtime_epoch")
    private Long localtimeEpoch;
    private String localtime;

}
