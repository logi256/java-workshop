package main.java.com.java.workshop.basics.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Listexample {

    public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("sw");
        names.add("loki");
        names.add("zameer");
        names.add("sobi");
        names.add("shiva");
        names.add("shivam");

        System.out.println(names);
        names.remove(5);
        names.set(5, "shiva");
        for (int i = 0; i < names.size(); i++) {
            System.out.println( names.get(i));
        }
        names.sort(Comparator.naturalOrder());
        System.out.println(names);


     System.out.println("Names starting with 's':");
        for (String name : names) {
            if (name.startsWith("s")) {
                System.out.println(name);
            }
        }
}
}
