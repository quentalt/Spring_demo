package com.quentinfou.demoSpringFramework.controller;

import com.quentinfou.demoSpringFramework.data.MessageDAO;
import com.quentinfou.demoSpringFramework.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Messagecontroller {
    private List<Message> messageList = new ArrayList<>();

    @Autowired
    private MessageDAO messageDAO;

        @GetMapping("/msg")
    public String showMessage(Model model) {

//    Message msg1 = new Message("Quentin","JeanPierre ta mère");
//    Message msg2 = new Message("Quentin","hellou");
//
//    messageList.add(msg1);
//    messageList.add(msg2);


        model.addAttribute("msglist",messageDAO.findAll());
        model.addAttribute("message",new Message());
        return "MessagePage";
    }
    @PostMapping("/msg")
    public String getMessage (@ModelAttribute Message newMessage) {
   Message msg = new Message(newMessage.getAuthor(),newMessage.getMessage());
   messageDAO.save(msg);

   return "redirect:msg";
    }


}
