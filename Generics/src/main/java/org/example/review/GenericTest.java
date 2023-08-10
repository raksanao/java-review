package org.example.review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Max",103));



        List<Teacher>teacherList=new ArrayList<>();
        teacherList.add(new Teacher("Eric",101));
        teacherList.add(new Teacher("David",102));

        printInfo(studentList);
        printInfo2(teacherList);
        printInfo3(studentList);
        printInfo3(teacherList);
        returnLastElement(studentList);
    }
    public static void printInfo(List<Student> studentList){
        for(Student student:studentList){

            System.out.println("student = " + student);
        }
        System.out.println(studentList.size());

    }

    public static void printInfo2(List<Teacher> teacherList){
        for(Teacher teacher:teacherList){

            System.out.println( teacher);
        }
        System.out.println(teacherList.size());

    }
    public static <T>void printInfo3(List<T>personList){
        for(T person:personList){
            System.out.println("person = " + person);
        }
        System.out.println(personList.size());
    }
//write a method that will take list of object and rerurns the last element in the list

public static<T>T returnLastElement(List<T> personList){
        return  personList.get(personList.size()-1);
}
}
