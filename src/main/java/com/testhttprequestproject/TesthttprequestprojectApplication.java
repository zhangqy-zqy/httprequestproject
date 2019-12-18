package com.testhttprequestproject;

import com.testhttprequestproject.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TesthttprequestprojectApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(TesthttprequestprojectApplication.class, args);
        StudentService studentService = (StudentService)applicationContext.getBean("studentService");
        String studentMethod = studentService.getStudentMethod();
        System.out.println(studentMethod);
    }

}
