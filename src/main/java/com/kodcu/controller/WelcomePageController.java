package com.kodcu.controller;

/*
 * Created by Vineet Sharma on 17/06/2018
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getPage(){
        return "index";
    }
}
