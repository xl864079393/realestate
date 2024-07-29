package com.zijunhuayuan.handler;
import com.zijunhuayuan.service.residentService;

import com.zijunhuayuan.bean.resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/residents")
public class resiDents {

    @Autowired
    private residentService residentService;

    @RequestMapping(value = "/")
    public String showResidents() {
        return "residentsPage";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listResidents(Model model) {
        List<resident> residents = residentService.getResidents();
        System.out.println(residents);
//        model.addAttribute("residents", residents);
        return "residentsPage";
    }
}
