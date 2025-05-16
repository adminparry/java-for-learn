package com.example.demo.Service;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.example.demo.Mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class IndexService<M extends IndexMapper<T>, T> {

    @Autowired
    protected M mapper;

    public IndexService() {
    }

    protected LambdaQueryChainWrapper<T> query() {
        return new LambdaQueryChainWrapper<>(this.mapper);
    }
}
