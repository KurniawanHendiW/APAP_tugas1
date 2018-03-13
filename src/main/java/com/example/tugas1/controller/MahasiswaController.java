package com.example.tugas1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MahasiswaController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
