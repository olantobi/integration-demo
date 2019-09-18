package com.liferon.integrationdemo.service.impl;

import com.liferon.integrationdemo.service.PrintService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PrintServiceImpl implements PrintService {
    public void print(String message) {
        System.out.println(message);
    }
}
