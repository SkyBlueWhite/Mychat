package com.harmoleap.mychat.model.reps;

/**
 * Created by Administrator on 2018/4/2.
 * 图文消息体
 */
public class Article {
    //图文消息名称
    private String Title;
    //图文消息描述
    private String Description;
    // 图片链接，支持 JPG、PNG 格式，较好的效果为大图 640*320，小图 80*80
    private String PicUrl;
    //点击图文消息跳转链接
    private String Url;
    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getDescription() {
        return null == this.Description ? "" : this.Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getPicUrl() {
        return null == this.PicUrl ? "" : this.PicUrl;
    }

    public void setPicUrl(String picUrl) {
        this.PicUrl = picUrl;
    }

    public String getUrl() {
        return null == this.Url ? "" : this.Url;
    }

    public void setUrl(String url) {
        this.Url = url;
    }
}
