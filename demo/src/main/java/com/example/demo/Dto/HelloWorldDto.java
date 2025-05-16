package com.example.demo.Dto;

import com.example.demo.Entity.HelloWorldEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HelloWorldDto {

    private String a;
    private String b;
    private String c;
    private String d;

    public HelloWorldDto(HelloWorldEntity helloWorldEntity) {
        this.a = helloWorldEntity.getV1();
        this.b = helloWorldEntity.getV2();
        this.c = helloWorldEntity.getV3();
    }

}
