package com.example.laboratorio4_20192858.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class HomeController {
    @GetMapping("")
    public String home(){
        return "login";
    }
}
