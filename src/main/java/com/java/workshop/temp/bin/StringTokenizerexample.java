package main.java.com.java.workshop.temp.bin;

import java.util.StringTokenizer;

public class StringTokenizerexample {

    public static void main(String[] args) {
        System.out.println("i learned java code");
        String str = "Hello, how are you? I hope you are doing well.";
        StringTokenizer tokenizer = new StringTokenizer(str, " ,?");

        System.out.println("Total tokens: " + tokenizer.countTokens());

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }   
    }

}
