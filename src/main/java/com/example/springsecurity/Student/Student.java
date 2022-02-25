package com.example.springsecurity.Student;

public class Student {
    private  final Integer Id;
    private  final String Name;

    public Student(Integer id, String name) {
        Id = id;
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
