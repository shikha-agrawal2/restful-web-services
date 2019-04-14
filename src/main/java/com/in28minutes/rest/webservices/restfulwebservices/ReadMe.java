package com.in28minutes.rest.webservices.restfulwebservices;

public class ReadMe {

    /* 1.
    If in controller, bean is return type in service method and no getters are defined in bean, then error is thrown
    Code:
    @GetMapping(path ="/hello-world-bean")
    public HelloWorldBean1 helloWorldBean(){
      return new HelloWorldBean1("Hello World");}

       Error: org.springframework.http.converter.HttpMessageNotWritableException:
       No converter found for return value of type: class com.in28minutes.rest.webservices.restfulwebservices.HelloWorldBean1
     */
    /* Http best practice is to return status 201 resource created instead of 200 status ok . Exmaple is shown in post mapping
    * */
}
