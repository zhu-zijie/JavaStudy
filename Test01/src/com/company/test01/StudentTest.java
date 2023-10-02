package com.company.test01;

public class StudentTest {

    public static void main(String[] args) {
//        Student stu = new Student();
//        stu.setName("张三");
//        stu.setAge(18);
//        System.out.println(stu.getName());
//        System.out.println(stu.getAge());

        Student stu1 = new Student();
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());

        Student stu2 = new Student("张三");
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());

        Student stu3 = new Student(18);
        System.out.println(stu3.getName());
        System.out.println(stu3.getAge());

        Student stu4 = new Student("张三", 18);
        System.out.println(stu4.getName());
        System.out.println(stu4.getAge());
    }
}

