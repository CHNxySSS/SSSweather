package cn.imust.sssweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shinelon on 2017/11/28 0028.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
