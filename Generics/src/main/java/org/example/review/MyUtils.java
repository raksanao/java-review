package org.example.review;

import java.util.ArrayList;
import java.util.List;

public class MyUtils<T extends Person>{
    public void  printInfor3(List<T> personList){
        for(T person: personList){
            System.out.println(person);
        }
        System.out.println(personList.size());

    }
    public T returnLastElement(List<T>personList){
        return personList.get(personList.size()-1);
    }
// write a method that takes a list of object and prints everyone's names one by one
    
    public void printNmaes(List<T>personList){
        for(T person:personList){
            System.out.println( person.getName());
        }
    }
    public static void main(String[] args) {
        MyUtils<Student>myUtils=new MyUtils<>();
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Max",103));

         myUtils.printInfor3(studentList);
    }
}
