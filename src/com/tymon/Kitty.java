package com.tymon;

public class Kitty {
    private String name;
    private int age;

    public Kitty(){
        name = "Kitty";
        age = 0;
    }

    public Kitty(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        int x = 10;
        return name;
    }

    public void setName(String input){
        this.name = input;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int input){
        this.age = input;
    }

    public String meow(){
        return age + " year old " + name + " says 'Meow!'";
    }

}
