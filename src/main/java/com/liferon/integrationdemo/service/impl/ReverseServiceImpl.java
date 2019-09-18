package com.liferon.integrationdemo.service.impl;

import com.liferon.integrationdemo.service.ReverseService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReverseServiceImpl implements ReverseService {
    public void reverse(String message) {
        System.out.println(new StringBuilder(message).reverse().toString());
    }
}
