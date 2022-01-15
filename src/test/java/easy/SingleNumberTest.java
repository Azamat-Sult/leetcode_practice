package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumber1() {
        SingleNumber singleNumber = new SingleNumber();
        int current = singleNumber.singleNumber(new int[] {2, 2, 1});
        int expected = 1;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void singleNumber2() {
        SingleNumber singleNumber = new SingleNumber();
        int current = singleNumber.singleNumber(new int[] {4, 1, 2, 1, 2});
        int expected = 4;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void singleNumber3() {
        SingleNumber singleNumber = new SingleNumber();
        int current = singleNumber.singleNumber(new int[] {1});
        int expected = 1;
        Assert.assertEquals(expected, current);
    }

}