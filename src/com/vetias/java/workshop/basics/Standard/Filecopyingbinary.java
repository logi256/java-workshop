package com.vetias.java.workshop.basics.Standard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopyingbinary {

    public static void main(String[] args) throws FileNotFoundException {
         FileInputStream inputStream = new FileInputStream("src/com/vetias/java/workshop/basics/Standard/logo.png");
         try (FileOutputStream outputStream = new FileOutputStream ("src/com/vetias/java/workshop/basics/Standard/logo_copy.png")) {
            byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                System.err.println("error is occurred while copying the file");
            }
                }
            }