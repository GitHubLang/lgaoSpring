package com.lgao.lgaospring.demos.controller;

import com.lgao.lgaospring.demos.server.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@Controller
public class TestController {

    @Autowired
    private WebSocket webSocket;

    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("s","hello");

        return "index";
    }


    @RequestMapping("/sendInfo")
    @ResponseBody
    public String sendInfo() {
        try {
            configureTasks();
        } catch (Exception e) {
            e.printStackTrace();
            return "信息发送异常!";
        }

        return "发送成功~";
    }

    @Scheduled(fixedRate=1000)
    private void configureTasks() throws IOException {
        webSocket.sendInfo("完成aaa!!!!");
    }


}
