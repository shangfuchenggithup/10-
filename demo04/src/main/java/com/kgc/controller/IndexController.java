package com.kgc.controller;

import com.kgc.pojo.meetingroom;
import com.kgc.service.meetingroomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {

    @Resource
    meetingroomService meetingroomService;
    @RequestMapping("/")
    public String index(Model model){
        List<meetingroom> list=meetingroomService.selectAll();
        model.addAttribute("pageInfo",list);
       return "index";
    }
    @RequestMapping("/tianjia")
    public String tinajia(){
        return "insert";
    }

    @RequestMapping("/dotinajia")
    public String dotinajia(meetingroom meetingroom){
       meetingroomService.add(meetingroom);
       return "redirect:/";
    }
}
