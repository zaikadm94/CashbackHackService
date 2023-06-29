package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {


    @Test

    public void boundary200Test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;

        int actual = service.remain(amount);
        int expected = 800;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void boundary1000Test() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void boundaryZeroTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);
    }
}
