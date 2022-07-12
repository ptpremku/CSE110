package com.tymon;

// This class definition below creates a new data type named Bunny.
// We can now declare Bunny variables, and instantiate Bummy Objects.
// Each Bunny object will know its name and its age.
// Each Bunny can hop, eat, adn sleep.
class Bunny {
    // declare required fileds below
    private String name;
    private  int age;


    public Bunny(){
        this.name = "Mopsy";
        this.age = 7;
    }

    public Bunny(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // make no other changes to this code
    public void print() {
        System.out.println(" (\\(\\   ");
        System.out.println(" (-.-)    ");
        System.out.println(" O_(\")(\") ");
        System.out.printf("%s is %d years old.\n", this.name, this.age);
    }
}
