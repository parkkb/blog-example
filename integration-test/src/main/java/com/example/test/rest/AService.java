package com.example.test.rest;

import org.springframework.stereotype.Service;

@Service
public class AService implements RestService{

    @Override
    public void test() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaa");
    }
}
