package com.zijunhuayuan.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class login {

    @RequestMapping("/userCheck")
    public String userLoginCheck() {
        // check login information
        // get user session
        return "mainPage";
    }

    @RequestMapping("/admCheck")
    public String admLoginCheck() {
        // check login information
        // get admin session
        return "redirect:/main/admPage";
    }

}
