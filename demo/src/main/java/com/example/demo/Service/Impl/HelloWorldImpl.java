package com.example.demo.Service.Impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.example.demo.Dto.HelloWorldDto;
import com.example.demo.Entity.HelloWorldEntity;
import com.example.demo.Mapper.HelloWorldMapper;
import com.example.demo.Service.HelloWorldService;
import com.example.demo.Service.IndexService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class HelloWorldImpl extends IndexService<HelloWorldMapper, HelloWorldEntity> implements HelloWorldService {

    @Override
    public List<HelloWorldDto> selectByHelloWorld() {
        return super.query().list().stream().map(HelloWorldDto::new).collect(Collectors.toList());

    }
}
