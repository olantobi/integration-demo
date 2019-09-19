package com.liferon.integrationdemo.service;

public class ReverseService {
    public void reverse(String message) {
        System.out.println(new StringBuilder(message).reverse().toString());
    }
}
