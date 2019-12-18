package com.testhttprequestproject.common;

import com.testhttprequestproject.entity.Student;
import com.testhttprequestproject.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangqianyu on 2019/12/9/009
 */
@Configuration
public class ConfigurationBean {


    @Bean
    public StudentService studentService(){
        return new StudentService();
    }
}
