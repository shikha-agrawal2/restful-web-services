package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date birthDate;
    // To prevent this error while using @PostMapping
    //Error comes like this : nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `com.in28minutes.rest.webservices.restfulwebservices.user.User`
    // (no Creators, like default construct, exist): cannot deserialize from Object value
    public User(){

    }
    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
