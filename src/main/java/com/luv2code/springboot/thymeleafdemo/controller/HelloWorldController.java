package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Mark the class as Spring MVC Controller
public class HelloWorldController
{
    // Method to show initial form
    @RequestMapping("/show-form")
    public String showForm()
    {
        return "hello-world-form";
    }

    // Method to process the HTML form
    @RequestMapping("/process-form")
    public String processForm()
    {
        return "hello-world";
    }

    /*
    * +---------------------------------+
    * | READ DATA FROM THE FORMDATA AND |
    * |     ADD DATA TO THE MODEL       |
    * +---------------------------------+
    *
    * The parameter HttpServletRequest let the method
    * receive FormData data and the Model parameter
    * is the container for that data of the FormData.
    * */
    @RequestMapping("process-form-v2")
    /*
    * @RequestParam() let get the request parameter inside its () and assign
    * to the parameter in the right, in this case the String name.
    * */
    public String letsShoutDude(@RequestParam("student_name") String name, Model model)
    {
        // 1. Convert the data to all caps
        name = name.toUpperCase();

        // 2. Create the message
        String message = "Yo! " + name;

        // 3. Add the message to the model
        model.addAttribute("message", message);

        return "hello-world";
    }
}
