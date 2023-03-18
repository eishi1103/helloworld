package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class HelloWorldController {

    @GetMapping("/greeting")
    public String hello() {
        Calendar c = Calendar.getInstance();
        int hours = c.get(Calendar.HOUR_OF_DAY);

        if (hours >= 4 && hours < 12) {
            return "おはよう";
        } else if(hours >= 12 && hours <= 17){
            return "こんにちは";
        }else if(hours >= 17 && hours <= 23){
            return "こんばんは";
        }else if(hours >= 23 && hours <= 24){
            return "おやすみなさい";
        } else {
            return "おやすみなさい";
        }

    }
}
