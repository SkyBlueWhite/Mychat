package com.harmoleap.mychat.model.req;

/**
 * Created by Administrator on 2018/4/2.
 * 图片消息
 */
public class ImgMessage extends BaseMessage {
    private String PicUrl;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }
}
