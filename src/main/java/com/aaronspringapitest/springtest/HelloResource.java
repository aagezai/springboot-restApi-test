package com.aaronspringapitest.springtest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {
    @GetMapping
    public String helloworld(){
        return "Hello World";
    }

    /**
     * This method will return the JSON format for Hello instance
     * @return The JSON format Hello World
     */
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello getJson(){
           return new Hello("Greetings","Hello World");
    }
}
