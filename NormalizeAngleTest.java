 


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NormalizeAngleTest {

    private NormalizeAngle normalizeAngle;

    @Before
    public void setUp(){
        normalizeAngle = new NormalizeAngle();
    }

    @Test
    public void normalizeValueUsingModuloTest(){
        //:Given
        Integer expected = 60;

        //:When
        Integer actual = normalizeAngle.normalizeValueUsingModulo(780);

        //:Then
        Assert.assertEquals("The value equals 60", expected, actual);
    }

    @Test
    public void normalizeValueUsingFloorModTest(){
        //:Given
        Integer expected = 60;

        //:When
        Integer actual = normalizeAngle.normalizeValueUsingFloorMod(780);

        //:Then
        Assert.assertEquals("The value equals 60", expected, actual);
    }
}
