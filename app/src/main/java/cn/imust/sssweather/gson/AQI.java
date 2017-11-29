package cn.imust.sssweather.gson;

/**
 * Created by Shinelon on 2017/11/28 0028.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
