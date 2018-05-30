package com.gem.demo.control;

import com.gem.demo.entity.Message;
import com.gem.demo.entity.MessageCatory;
import com.gem.demo.entity.User;
import com.gem.demo.service.MessageService;
import com.gem.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class UserControl {
    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;
    @RequestMapping("/UserInfo")
    public List<User> getAllUser(){
        return userService.userlist();
    }
@RequestMapping("/talk")
    public void talk(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        List<MessageCatory> catories=messageService.getAllMessageCatory();
        request.setAttribute("messageCatory",catories);
        request.getRequestDispatcher("/talk.jsp").forward(request,response);
    }
    @RequestMapping("/selectMessages")
    public List<Message> selectMessages(int index){
        List<MessageCatory> catories=messageService.getAllMessageCatory();
        MessageCatory messageCatory=catories.get(index-1);
        List<Message> messages=messageService.getMessageByCatory(messageCatory.getId());
        return messages;

    }
}
