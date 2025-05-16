package com.example.demo.controller;

import com.example.demo.Dto.HelloWorldDto;
import com.example.demo.Mapper.HelloWorldMapper;
import com.example.demo.Mapper.IndexMapper;
import com.example.demo.Service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {


    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping
    public String hello() {
        return "hello world for spring boot";
    }

    @RequestMapping("/mybatis")
    public List<HelloWorldDto> world(){
        return helloWorldService.selectByHelloWorld();
    }


}
