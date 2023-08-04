import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. Create a set
        Set<Student> mySet=new HashSet<>();
        mySet.add(new Student(1,"Sofia"));
        mySet.add(new Student(2,"Layla"));
        mySet.add(new Student(3,"Omar"));
        mySet.add(new Student(3,"Omar"));
        System.out.println("mySet = " + mySet);
        Set<Integer>numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println( numSet);
        System.out.println(numSet.add(2));//it returns false if it has duplicate

        System.out.println("First char is -> "+firstRepeatingChar("Java Developer"));
    }

    public static Character firstRepeatingChar(String str){
        //Create a hashmap
        Set<Character>chars=new HashSet<>();
        //Iteration return char  if add returns false
        for (Character ch:str.toCharArray())if(!chars.add(ch))return ch;
        return  null;
    }
}
