package com.code;

public class Person {
    
    private String name;
    private int age;
    private boolean isStudent;
    private int id;

    public Person(){

    }

    public Person(String name, int age, boolean isStudent, int id){

        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.id = id;

    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    public void setAge(int age){

        this.age = age;
        
    }

    public int getAge(){

        return age;
        
    }

    public void setIsStudent(boolean isStudent){

        this.isStudent = isStudent;
        
    }

    public boolean getIsStudent(){

        return isStudent;
        
    }

    public void setId(int id){

        this.id = id;

    }

    public int getId(){

        return id;

    }

    @Override
    public String toString(){

        return "Person{name: " + name + ", age: " + age + ", isStudent: " + isStudent + " }";

    }
}
