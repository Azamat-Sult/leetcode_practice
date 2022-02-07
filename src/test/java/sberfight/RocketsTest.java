package sberfight;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RocketsTest {

    @Test
    public void test1() {
        List<Integer> pos = new ArrayList<>();
        pos.add(3);
        pos.add(11);
        List<Integer> speed = new ArrayList<>();
        speed.add(5);
        speed.add(1);
        Assert.assertEquals(1, Rockets.getResult(pos, speed));
    }

    @Test
    public void test2() {
        List<Integer> pos = new ArrayList<>();
        pos.add(2);
        pos.add(3);
        List<Integer> speed = new ArrayList<>();
        speed.add(1);
        speed.add(2);
        Assert.assertEquals(2, Rockets.getResult(pos, speed));
    }

    @Test
    public void test3() {
        List<Integer> pos = new ArrayList<>();
        pos.add(2);
        List<Integer> speed = new ArrayList<>();
        speed.add(1);
        Assert.assertEquals(1, Rockets.getResult(pos, speed));
    }

    @Test
    public void test4() {
        List<Integer> pos = new ArrayList<>();
        pos.add(0);
        List<Integer> speed = new ArrayList<>();
        speed.add(10);
        Assert.assertEquals(1, Rockets.getResult(pos, speed));
    }

    @Test
    public void test5() {
        List<Integer> pos = new ArrayList<>();
        pos.add(0);
        pos.add(0);
        List<Integer> speed = new ArrayList<>();
        speed.add(1);
        speed.add(2);
        Assert.assertEquals(1, Rockets.getResult(pos, speed));
    }

    @Test
    public void test6() {
        List<Integer> pos = new ArrayList<>();
        pos.add(0);
        pos.add(1);
        pos.add(2);
        pos.add(3);
        pos.add(100);
        List<Integer> speed = new ArrayList<>();
        speed.add(0);
        speed.add(1);
        speed.add(2);
        speed.add(3);
        speed.add(0);
        Assert.assertEquals(4, Rockets.getResult(pos, speed));
    }
}