package main.java.com.java.workshop.temp.bin;

public class Upper {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName.toUpperCase());
        String[] words = fullName.split(" ");
        for (String word : words) {
            System.out.println(word.toUpperCase()); 



             

         
        }
    }
}
