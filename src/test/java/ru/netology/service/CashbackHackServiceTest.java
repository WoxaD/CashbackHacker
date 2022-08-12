package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnTheMissingAmountToReceiveACashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 900;

        assertEquals(100, cashbackHackService.remain(sum));
    }

    @org.junit.Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfMoreThan1000AreSpent() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1050;

        assertEquals(950, cashbackHackService.remain(sum));
    }

    @org.junit.Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfNothingNeedsToBeBoughtInAddition() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1000;

        assertEquals(0, cashbackHackService.remain(sum));
    }
}