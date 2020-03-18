package com.example.demo.controller;

import com.example.demo.service.DashboardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    private DashboardService dashboardService;

    @GetMapping("/dashboard")
    public String getDashDetail(Model model){
        String texto = "aaaai";
        model.addAttribute("texto", texto);
        return "/dashboard";
    }


}
