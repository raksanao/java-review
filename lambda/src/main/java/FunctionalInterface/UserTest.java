package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        //Print all elements in the list
        // Print all users that last name starts with E
List<User>users=new ArrayList<>();
users.add(User.builder().firstName("Laylush").lastname("Llimova").age(10).build());

        users.add(User.builder().firstName("Sofia").lastname("Olimova").age(10).build());
      users.add(User.builder().firstName("Omar").lastname("Klim").age(6).build());


      // printName(users,p-> true);

       //Print all users that last name starts with E
        printName(users,p->p.getLastname().startsWith("O"));

    }
    private  static void printName(List<User>users, Predicate<User> p){
        for (User user:users) {
            if(p.test(user)){
                System.out.println("user = " + user.toString());

        }

        }

    }
}
