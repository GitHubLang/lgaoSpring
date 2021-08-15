package com.lgao.lgaospring.demos.server;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TestService {

    @Autowired
    WebSocket webSocket;

    public void test1(String sid) throws IOException, InterruptedException {

        if(sid != null){
            webSocket.test1(sid);
        }



    }


}
