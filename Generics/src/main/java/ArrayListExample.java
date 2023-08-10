import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> items =new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
      // items.add("apple");

        printDouble(items);

        for(Integer item:items){
            System.out.println( item*2);
        }
    }
    private static void printDouble(ArrayList <Integer>item){
       for (Object i :item){
           System.out.println((Integer) i*2);
       }
    }
}
