import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> item =new ArrayList<Integer>();
        item.add(1);
        item.add(2);
        item.add(3);
        item.add(4);
       // item.add("apple") ;
        printDouble(item);
    }
    private static void printDouble(ArrayList <Integer>item){
       for (Object i :item){
           System.out.println((Integer) i*2);
       }
    }
}
