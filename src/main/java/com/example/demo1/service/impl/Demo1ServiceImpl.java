package com.example.demo1.service.impl;

import com.example.demo1.service.Demo1Service;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Demo1ServiceImpl implements Demo1Service {

    @Override
    public int generateRandomInt() {
        return (new Random()).nextInt(1000);
    }
}
