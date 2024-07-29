package com.zijunhuayuan.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/main")
public class MainPage {

        @RequestMapping("/")
        public String showMainPage() {
            return "mainPage";
        }

        @RequestMapping("/admPage")
        public String showAdmMainPage(Model model) {
            model.addAttribute("page","home");
            return "admMainPage";
        }

        @RequestMapping("/admUserPage")
        public String showAdmUserPage(Model model){
            model.addAttribute("page","users");
            return "admMainPage";
        }

        @RequestMapping("/admFeePage")
        public String showAdmFeePage(Model model){
            model.addAttribute("page","expenses");
            return "admMainPage";
        }
}
