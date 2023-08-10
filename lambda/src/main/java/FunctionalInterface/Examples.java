package FunctionalInterface;

import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        //***************PREDICATE******************

//        Predicate<Integer>lesserThan=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);
//    }
//}

        Predicate<Integer> lesserThan = a -> a < 18;//implimentaion of test method that belongs to predicate interface
        // Boolean result=lesserThan.test(50);
        // System.out.println("result = " + result); or we can print directly
        System.out.println(lesserThan.test(50));

        //Predicate always returns boolean true or false it compares
        Predicate<String> name = b -> b.equals("ruxa");
        System.out.println(name.test("ruxa"));


        //***************Consumer******************
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);
        //***************BiConsumer******************

        BiConsumer<String,String>display2=(x,y)-> System.out.println(x.equals(y));
        display2.accept("hi","rux");

        BiConsumer<Integer,Integer>display3=(x,y)-> System.out.println(x+y);
        display3.accept(3,4);

        //***************Function******************
        Function<String,String> fun=s->"hello "+s;
String str=  fun.apply("Ruxa");
        System.out.println( str);
        //***************Supplier******************
        Supplier<Double>randomeValue=()->Math.random();
      Double p=  randomeValue.get();
        System.out.println("p = " + p);

        }
    }

