package main.java.com.java.workshop.basics.Collection;

import java.util.HashMap;
import java.util.Map;

public class Studentmap {

    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "John");
        studentMap.put(102, "Alice");
        studentMap.put(103, "Bob");         
        studentMap.put(104, "Diana");
        studentMap.put(105, "Eve");     
        studentMap.put(106, "Frank");
        studentMap.put(101, "John");
        System.out.println(studentMap);
    }

}
