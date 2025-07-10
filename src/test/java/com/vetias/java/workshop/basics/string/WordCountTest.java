package test.java.com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.java.com.java.workshop.basics.string.wordcount.WordCount;

public class WordCountTest {

    @Test
    public void testWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("Hello, world! This is a test.");
        Assertions.assertEquals(7, count);
    }
}
