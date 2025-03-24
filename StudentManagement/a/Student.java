package StudentManagement.a;

import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private int age;

    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;

    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ", student ID: " + id + ",  age:" + age;
    }

}
