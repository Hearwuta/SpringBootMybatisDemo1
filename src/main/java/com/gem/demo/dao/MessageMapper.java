package com.gem.demo.dao;

import com.gem.demo.entity.Message;

import java.util.List;

public interface MessageMapper {
    public List<Message> getMessageByCatory(int catoryId);
    public String getAnswer(int messageId);
}
