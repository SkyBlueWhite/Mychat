package com.harmoleap.mychat.model.req;

/**
 * Created by Administrator on 2018/4/2.
 * 地理位置信息
 */
public class LocationMessage extends  BaseMessage{
    //地理位置纬度
    private String Location_X;
    //地理位置经度
    private String Location_Y;
    //地图缩放大小
    private String LocationScale;
    //地理位置信息
    private String locationInfo;

    public String getLocation_X() {
        return Location_X;
    }

    public void setLocation_X(String location_X) {
        Location_X = location_X;
    }

    public String getLocation_Y() {
        return Location_Y;
    }

    public void setLocation_Y(String location_Y) {
        Location_Y = location_Y;
    }

    public String getLocationScale() {
        return LocationScale;
    }

    public void setLocationScale(String locationScale) {
        LocationScale = locationScale;
    }

    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }
}
