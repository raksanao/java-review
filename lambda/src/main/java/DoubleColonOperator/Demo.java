package DoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
Calculate s1=(x,y)->Calculator.findSum(x,y); //same as line 7
       s1.calculate(10,20);
       Calculate s2=Calculator::findSum;
       s2.calculate(10,2);
       //Reference to instance methid
        Calculate m1=(x,y)->new Calculator().findfMulitply(x,y);
        m1.calculate(4,5);
        Calculator obj=new Calculator();
        Calculate m2=obj::findfMulitply;
        m2.calculate(9,7);
        Calculate m3=new Calculator()::findfMulitply;
        m3.calculate(8,7);

        BiFunction<String,Integer,String>fn=(str,i)->str.substring(i);

        System.out.println(fn.apply("Developer",7));
        BiFunction<String,Integer,String>fn2=String::substring;
        System.out.println(fn2.apply("Developer",3));
       Consumer<Integer> display=i-> System.out.println(i);
display.accept(20);

Consumer<Integer>display2=System.out::println;
display2.accept(23);
    }
}
