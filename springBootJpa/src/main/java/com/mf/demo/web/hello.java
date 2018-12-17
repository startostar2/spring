package com.mf.demo.web;


import com.mf.demo.server.UserServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/userTag")
public class hello {


    @Autowired
    private UserServer userServer;

    @RequestMapping(value = "/hello"
//            , method = {RequestMethod.POST, RequestMethod.GET}
    )
    public String execute(
//            @RequestParam int userId, @RequestParam int appId
    ) {
//        User user = userDao.findById(1);
        String analysis = userServer.analysis(1, "你好");
        return analysis;
//        127.0.0.1:8080/userTag/hello
    }


}
