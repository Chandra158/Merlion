package com.cp.merlion.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {


    @Override
    public String getName() {
        return "hola"+5;
    }
}