package com.example.demo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.jdbc.Database;

@RestController
@RequestMapping("/api")
public class rest_api {

    @Autowired
    private Database database;

    @GetMapping("/demo")
    public String m1() {
        return "Welcome to Tomcat server";
    }

    
}
