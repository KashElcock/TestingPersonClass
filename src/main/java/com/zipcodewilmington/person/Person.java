package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name ="";
    private int age = Integer.MAX_VALUE;;
    private int weight = 0;
    private double shoeSize = 0.0;
    private double height = 0.0;
    private String eyeColor = "";
    private String bloodType = "";
    private Boolean isAlive = Boolean.TRUE;
    public Person() {}
    public Person(int age) {setAge(age);}
    public Person(String name) {
        setName(name);
    }
    public Person(String name, int age) {
       setName(name);
       setAge(age);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {this.age = age;}
    public void setWeight() {this.weight = weight;}
    public String getName() { return name;}
    public Integer getAge() {
        return age;
    }

}
