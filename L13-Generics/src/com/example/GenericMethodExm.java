package com.example;

public class GenericMethodExm {

    public <T extends Number> void genericMethod(T data) {
        System.out.println("Generic method1 void");
        System.out.println("data-> "+data);
    }

    public <T> T getGenericMethod(T data){
        System.out.println("Generic method1 not void");
        return data;
    }
}
