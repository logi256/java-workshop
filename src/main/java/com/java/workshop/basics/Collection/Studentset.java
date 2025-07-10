package main.java.com.java.workshop.basics.Collection;

import java.util.HashSet;
import java.util.Set;

public class Studentset {
 
     public static void main(String[] args) {
         Set<Integer> rollno = new HashSet<>();
         rollno.add(101);
         rollno.add(102);
         rollno.add(103);
         rollno.add(101);
         rollno.add(104);
         rollno.add(105);
         rollno.add(106);

         System.out.println( rollno);
     }
    }