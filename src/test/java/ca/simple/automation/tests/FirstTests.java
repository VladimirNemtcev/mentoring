package ca.simple.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Roman_Iovlev on 1/21/2018.
 */
public class FirstTests {

    @Test
    public void simpleTest() {
        int first = 2;
        int second = 3;
        Assert.assertEquals(first+second,4);
    }
}
