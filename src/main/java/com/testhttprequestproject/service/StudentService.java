package com.testhttprequestproject.service;

import com.testhttprequestproject.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangqianyu on 2019/12/9/009
 */
public class StudentService {
    @Autowired
    public Student student;

    public String getStudentMethod(){
        return student.toString();
    }
}
