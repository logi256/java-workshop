package com.vetias.java.workshop.temp.bin;

import java.util.Scanner;

public class Namegenrater {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.err.println("Enter your gender: ");
            String gender = scanner.nextLine();
            System.out.println("Enter your qualification: ");
            String qualification = scanner.nextLine();
            if("male".equalsIgnoreCase(gender)) {
                System.out.println(" Mr. " + name + ", tittle " + qualification);
            } else {
                System.out.println(" Ms. " + name + ", title " + qualification);
            }
        }
        }
    }
