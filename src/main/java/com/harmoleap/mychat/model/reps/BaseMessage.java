package com.harmoleap.mychat.model.reps;

/**
 * Created by Administrator on 2018/4/2.
 * 返回消息体-基本消息
 */
public class BaseMessage {
    //接收方帐号
    private String ToUserName;
    //开发者微信号
    private String FromUserName;
    //创建时间
    private long CreateTime;
    // 消息类型（text/music/news）
    private String MsgType;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }
}
