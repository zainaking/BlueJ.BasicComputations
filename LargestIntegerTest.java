 


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestIntegerTest {

    private LargestInteger largestInteger;

    @Before
    public void setUp(){
        largestInteger = new LargestInteger();
    }

    @Test
    public void findLargestNumberUsingConditionalTest(){
        // :Given
        Integer expected = 30;

        // :When
        Integer actual = largestInteger.findLargestNumberUsingConditional(new Integer[]{30,20,10});

        // :Then
        Assert.assertEquals("The Largest Number should be 30", expected, actual);
    }

    @Test
    public void findLargestNumberUsingMathMaxTest(){
        // :Given
        Integer expected = 600;

        // :When
        Integer actual = largestInteger.findLargestNumberUsingMathMax(new Integer[]{300,200,600});

        // :Then
        Assert.assertEquals("The Largest Number should be 600.", expected, actual);
    }
}
