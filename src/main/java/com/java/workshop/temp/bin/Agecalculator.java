package main.java.com.java.workshop.temp.bin;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {

    public static void main(String[] args) { 
        System.out.println("enter you date of birth (25-05-2006): ");
        Scanner scanner;
        scanner = new Scanner(System.in);
        String dateOfBirth = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dateOfBirth);

        
        LocalDate today = LocalDate.now();
        int age = today.getYear() - dob.getYear();
        if (today.getDayOfYear() < dob.getDayOfYear()) {
            age--;
        }
        System.out.println("Your age is: " + age);
    }
}
