package com.nal95.dempwepapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DempWepAppApplication {

    @GetMapping("")
    public String getMessage(){
        return "YuYU your first Azure app";
    }

    public static void main(String[] args) {
        SpringApplication.run(DempWepAppApplication.class, args);
    }

}
