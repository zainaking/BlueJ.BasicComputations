 


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerPrinterTest {

    IntegerPrinter integerPrinter;

    @Before
    public void setUp(){
        integerPrinter = new IntegerPrinter();
    }

    @Test
    public void printIntegerAsBinaryTest(){
        //:Given
        String expected = "111110100";

        //:When
        String actual = integerPrinter.printIntegerAsBinary(500);

        //:Then
        Assert.assertEquals("The value equals 111110100", expected, actual);
    }

    @Test
    public void printIntegerAsHexadecimal(){
        //:Given
        String expected = "1f4";

        //:When
        String actual = integerPrinter.printIntegerAsHexadecimal(500);

        //:Then
        Assert.assertEquals("The value equals 1f4", expected, actual);
    }

    @Test
    public void printIntegerAsOctalTest(){
        //:Given
        String expected = "764";

        //:When
        String actual = integerPrinter.printIntegerAsOctal(500);

        //:Then
        Assert.assertEquals("The value equals 764", expected, actual);
    }

}
