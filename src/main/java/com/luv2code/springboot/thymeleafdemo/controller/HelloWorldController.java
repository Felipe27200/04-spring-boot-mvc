package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Mark the class as Spring MVC Controller
public class HelloWorldController
{
    // Method to show initial form
    @GetMapping("/show-form")
    public String showForm()
    {
        return "hello-world-form";
    }

    // Method to process the HTML form
    @GetMapping("/process-form")
    public String processForm()
    {
        return "hello-world";
    }
}
