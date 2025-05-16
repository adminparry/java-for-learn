package com.example.demo.Mapper;

import com.example.demo.Dto.HelloWorldDto;
import com.example.demo.Entity.HelloWorldEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloWorldMapper extends IndexMapper<HelloWorldEntity> {


}
