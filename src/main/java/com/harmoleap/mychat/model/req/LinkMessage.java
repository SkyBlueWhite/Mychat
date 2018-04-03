package com.harmoleap.mychat.model.req;

/**
 * Created by Administrator on 2018/4/2.
 * 链接消息
 */
public class LinkMessage extends BaseMessage {
    //链接消息标题
    private String Title;
    //链接消息标题
    private String Description;
    //链接地址
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
