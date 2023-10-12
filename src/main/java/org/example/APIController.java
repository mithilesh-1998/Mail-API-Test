package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @Autowired
    Car carObj;


    @GetMapping("api/name")
    public String getName() {
        String vlaue = String.valueOf(carObj);
        MailHandlerBase.sendMail(vlaue);
        return vlaue;
    }
}
