package test;

public class Student {

    private String name;

    private int age;

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }


    public static void main(String[] args) {
        System.out.println("hello");
    }
}
