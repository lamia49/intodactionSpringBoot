package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomCntoller {

    @GetMapping("/name")
    public String name(){
        return "My name is Lamia.";
    }
    @GetMapping("/age")
    public String age(){
        return "My age is 29";
    }

    @GetMapping("/check/status")

    public String check(){
        boolean check=true;
        if(check){
            return "Evreything is OK";
        }
        return"somthing wrong";
    }

    @GetMapping("/health")

    public String health(){
        return "Server Health is up and running";
    }

    @GetMapping("/names")

    public ArrayList<String> names() {

        ArrayList<String> names = new ArrayList<>();
        names.add("lamia");
        names.add("lena");
        names.add("nawal");

       return names;
    }



}
