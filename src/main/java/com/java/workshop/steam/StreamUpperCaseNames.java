package main.java.com.java.workshop.steam;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("shahul");
        names.add("krishana");
        names.add("zameer");
        names.add("iman");
        names.add("santhosh");
        names.add("dinesh");

        names.stream()
             .filter(name -> name.startsWith("s"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
        names.stream().distinct().map(String::toUpperCase).forEach(System.out::println);

    }
}
