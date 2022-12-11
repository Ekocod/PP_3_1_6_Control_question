package com.example.pp_3_1_6_control_question;

import com.example.pp_3_1_6_control_question.config.MyConfig;
import com.example.pp_3_1_6_control_question.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Pp316ControlQuestionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        HTTPMethods httpMethods = applicationContext.getBean("HTTPMethods", HTTPMethods.class);
        List<String> allUsers = httpMethods.getAllUsers();
        System.out.println(allUsers);
        httpMethods.saveUser(new User(3L, "James", "Brown", (byte) 15));
        httpMethods.updateUser(new User(3L, "Thomas", "Shelby", (byte) 30));
        httpMethods.deleteUser(3L);
        System.out.println(HTTPMethods.result);
    }
}
