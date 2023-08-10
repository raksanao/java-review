package Task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory=new ArrayList<>();
        inventory.add(new Orange(301,Color.GREEN));
        inventory.add(Orange.builder().wight(200).color(Color.RED).build());
        inventory.add(Orange.builder().wight(300).color(Color.RED).build());
        inventory.add(new Orange(401,Color.GREEN));
        inventory.add(Orange.builder().wight(500).color(Color.RED).build());
        inventory.add(Orange.builder().wight(600).color(Color.RED).build());

        OrangeFormatter simpleFormatter=orange->"An orange of "+orange.getWight()+"g";

        
        prityPrintApple(inventory,simpleFormatter);
        prityPrintApple(inventory,orange->"An orange of "+orange.getWight()+"g");

        System.out.println("*********************");
        OrangeFormatter fancyForamatter=orange -> {
            String characteristic=orange.getWight()>150?" Heavy":"Light";
            return "A "+characteristic+" "+orange.getColor()+ " orange";
        };
        prityPrintApple(inventory,fancyForamatter);
    }
    
    
    private  static void  prityPrintApple(List<Orange>inventory,OrangeFormatter orangeFormatter){
        for (Orange orange:inventory) {
            String output=orangeFormatter.accept(orange);
            System.out.println("output = " + output);
            
        }
    }
}
