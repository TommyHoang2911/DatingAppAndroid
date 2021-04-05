package com.example.dating_app_android_project.Conversation.Object;

public class MessageObject {
    String messageId,
            senderId,
            message,
            datetime;

//    ArrayList<String> mediaUrlList;

    public MessageObject() {
    }

    public MessageObject(String messageId, String senderId, String message, String datetime) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.datetime = datetime;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessage() {
        return message;
    }
}
