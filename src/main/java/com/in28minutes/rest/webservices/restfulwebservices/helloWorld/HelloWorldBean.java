package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {
    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }
//its important for GetMapping otherwise error is thrown in browser
    public String getMessage() {
        return message;
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
