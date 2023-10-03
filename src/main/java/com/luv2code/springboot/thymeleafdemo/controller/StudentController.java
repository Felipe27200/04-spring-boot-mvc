package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/*
* The @Controller Make available the
* bean or Controller for the Spring app
* so, you don't have to forget.
* */
@Controller
public class StudentController
{
    @GetMapping("/show-student-form")
    public String showForm(Model model)
    {
        // 1. Create a Student object
        Student student = new Student();

        /*
        * 2. Add the Student object to the Model
        *
        * We create model Attribute "student" and give it
        * the value of the student object
        * */
        model.addAttribute("student", student);

        return "student-form";
    }

    @PostMapping("process-student-form")
    /*
    * +---------------------------------+
    * | GET THE ATTRIBUTE FROM THE FORM |
    * +---------------------------------+
    *
    * We have to get the model attribute with the
    * same name we called it, so, in this way
    * we can obtain its values.
    * */
    public String processFrom(@ModelAttribute("student") Student student)
    {
        // Log the input data
        System.out.println("The student: " + student.getFirstName() + " " + student.getLastName());

        return "student-confirmation";
    }
}
