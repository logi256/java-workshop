package test.java.com.vetias.java;

import test.java.com.vetias.java.workshop.basics.string.Assertions;
import test.java.com.vetias.java.workshop.basics.string.Test;

public class squaretest {

    @Test
    public void testSquare() {
        Square square = new Square();
        Assertions.assertEquals(25, square.findSquare(5));
    }

    

}
