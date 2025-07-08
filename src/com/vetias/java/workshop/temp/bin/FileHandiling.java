package com.vetias.java.workshop.temp.bin;

import java.io.File;

public class FileHandiling {

    public static void main(String[] args) {
        File file = new File("src");

        if (!file.isDirectory()) {
            System.out.println("it is not a directory");
            File[] files = file.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File f : files) {
                    System.out.println("Extracted: " + f.getName());
                }
            } else {
                System.out.println("loki is a directory.");
            }
                


        }
    }
}




