package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController
{
    // create mapping for "/hello"

    /*
    * When we will access to this route, we will be
    * redirect to the html template with the data.
    *
    * In this case the template is hello-world.html
    * */
    @GetMapping("/hello")
    public String sayHello(Model model)
    {
        /*
        * Is for aggregate an attribute to the view
        * the name is the first argument and the second
        * is its values.
        * */
        model.addAttribute("theDate", new java.util.Date());

        /*
        * So we are using Thymeleaf and that is in the POM,
        * so SpringBoot use it for default.
        *
        * When we return and String the text that it have is
        * the name of file .html that we create in src/resource/template
        * and Thymeleaf will look for it for load the data.
        * */
        return "hello-world";
    }
}
