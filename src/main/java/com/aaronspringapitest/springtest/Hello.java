package com.aaronspringapitest.springtest;

public class Hello {
    private  String hello_world;
    private  String greetings;

    public Hello(String greetings, String hello_world) {
        this.greetings =greetings;
        this .hello_world=hello_world;
    }

    public String getHello_world() {
        return hello_world;
    }

    public void setHello_world(String hello_world) {
        this.hello_world = hello_world;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
