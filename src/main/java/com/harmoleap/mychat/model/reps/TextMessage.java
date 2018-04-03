package com.harmoleap.mychat.model.reps;

/**
 * Created by Administrator on 2018/4/2.
 * 文本消息内容
 */
public class TextMessage extends BaseMessage {
    //回复的文本消息
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
