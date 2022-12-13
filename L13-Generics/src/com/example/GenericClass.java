package com.example;

public class GenericClass<T extends Number> {

    private T data;

    public GenericClass(T data) {
        this.data =data;
    }

    public T getData() {
        return this.data;
    }
}
