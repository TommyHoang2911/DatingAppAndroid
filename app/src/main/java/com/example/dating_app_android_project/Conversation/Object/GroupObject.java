package com.example.dating_app_android_project.Conversation.Object;

import com.example.dating_app_android_project.Utils.User;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupObject implements Serializable {
    private String chatId;

    private User userMatch;

    public GroupObject(String chatId, User userMatch) {
        this.chatId = chatId;
        this.userMatch = userMatch;
    }

    public GroupObject(User userMatch) {
        this.userMatch = userMatch;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public User getUserMatch() {
        return userMatch;
    }

    public void setUserMatch(User userMatch) {
        this.userMatch = userMatch;
    }
}
