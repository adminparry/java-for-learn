package com.example.demo.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName(value = "hello_world")
public class HelloWorldEntity {
    private String v1;
    private String v2;
    private String v3;
    private String v4;
    private String v5;
}
