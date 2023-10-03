package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String letsShoutDude(HttpServletRequest request, Model model)
    {
        // 1. Read the request parameter from the HTML form
        String name = request.getParameter("student_name");

        // 2. Convert the data to all caps
        name = name.toUpperCase();

        // 3. Create the message
        String message = "Yo! " + name;

        // 4. Add the message to the model
        model.addAttribute("message", message);

        return "hello-world";
    }
}
