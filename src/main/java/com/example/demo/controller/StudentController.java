package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    private StudentService studentService;
    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/insert")
    public String insert(Model model){
        model.addAttribute("student", new Student());
        return "insert";
    }

    @PostMapping("/insert")
    public String insertSubmit(@ModelAttribute("student") Student student){
        studentService.insert(student);
        return "insertsuc";
    }

    @GetMapping("/delete")
    public String delete(Model model){
        model.addAttribute("student", new Student());
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteSubmit(@ModelAttribute("student") Student student){
        studentService.deleteByPrimaryKey(student.getStudentId());
        return "deletesuc";
    }

    @GetMapping("/query")
    public String query(Model model){
        model.addAttribute("student", new Student());
        return "query";
    }

    @PostMapping("/query")
    public String querySubmit(@ModelAttribute("student") Student student, Model model){
        Student newStudent = studentService.selectByPrimaryKey(student.getStudentId());
        model.addAttribute("newStudent", newStudent);
        return "querysuc";
    }

    @GetMapping("/change")
    public String change(Model model){
        model.addAttribute("student", new Student());
        return "modify";
    }

    @PostMapping("/change")
    public String changeSubmit(@ModelAttribute("student") Student student){
        studentService.updateByPrimaryKey(student);
        return "modifysuc";
    }

}
