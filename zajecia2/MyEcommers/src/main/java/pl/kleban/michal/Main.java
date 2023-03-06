package pl.kleban.michal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static  void main(String[] args) {

        Greeter greeter = new Greeter();
        greeter.greet("Kuba");
        System.out.println("Hello world!");

        List<String> names = Arrays.asList("Jakub","Michal","Maciek","Piotr","Kasia", "Maria");

        List<String> ladies = new ArrayList<String>();
        for(String name: names){
            if(name.endsWith("a")){
                ladies.add(name);
            }
        }

        for(String ladiesName: ladies){
            greeter.greet(ladiesName);
        }


        names.stream()
                .filter(name -> name.endsWith("a"))
                .filter(name -> name.startsWith("K"))
                .map(String::toUpperCase)
                .forEach(greeter::greet);

    }
}