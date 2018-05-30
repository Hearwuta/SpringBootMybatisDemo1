package com.gem.demo.service;

import com.gem.demo.entity.Message;
import com.gem.demo.entity.MessageCatory;

import java.util.List;

public interface MessageService {
    public List<Message> getMessageByCatory(int catoryId);
    public String getAnswer(int messageId);
    public List<MessageCatory> getAllMessageCatory();
}
