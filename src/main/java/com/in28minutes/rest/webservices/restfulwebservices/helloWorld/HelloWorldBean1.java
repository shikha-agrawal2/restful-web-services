package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean1 {
    private String message;
    public HelloWorldBean1(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
