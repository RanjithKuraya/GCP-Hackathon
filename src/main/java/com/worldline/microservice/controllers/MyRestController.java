package com.worldline.microservice.controllers;

import com.worldline.microservice.utils.VersionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyRestController {

    private final VersionUtil versionUtil;

    public MyRestController(VersionUtil versionUtil) {
        this.versionUtil = versionUtil;
        System.out.println(versionUtil.getVersion());
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("version", versionUtil.getVersion());
        return "index";
    }
}
