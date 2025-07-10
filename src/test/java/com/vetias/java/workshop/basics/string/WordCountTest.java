package test.java.com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Test;
import main.java.com.java.workshop.basics.string.wordcount.WordCount;   
import org.junit.jupiter.api.Assertions;


public class WordCountTest {

    @Test            
     public void testWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is a test.");
        Assertions.assertEquals(4, count);
    }

    @Test
    public void testEmptyString() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count(" loki");
        Assertions.assertEquals(1, count);
    }
}
