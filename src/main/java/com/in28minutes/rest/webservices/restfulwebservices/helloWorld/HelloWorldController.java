package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {
    //GET
    //URI -/hello-world
    //method- "Hello World"
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path ="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
    //URI- /hello-world-bean
    @GetMapping(path ="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        //return new HelloWorldBean1("Hello World");  // error "no converter found" as HelloWorldBean1 doesn't have getters
        return new HelloWorldBean("Hello World");      //no error as HelloWorldBean has getters
    }
    //URI- /hello-world/path-variable/in28minutes
    @GetMapping(path ="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
