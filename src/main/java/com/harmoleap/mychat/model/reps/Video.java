package com.harmoleap.mychat.model.reps;

/**
 * Created by Administrator on 2018/4/2.
 * @Description: 视频消息体
 */
public class Video {
    private String MediaId;
    private String Title;
    private String Description;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
