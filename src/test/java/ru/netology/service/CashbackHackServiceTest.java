package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnTheMissingAmountToReceiveACashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 900;

        assertEquals(cashbackHackService.remain(sum), 100);
    }

    @org.junit.Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfMoreThan1000AreSpent() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1050;

        assertEquals(cashbackHackService.remain(sum), 950);
    }

    @org.junit.Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfNothingNeedsToBeBoughtInAddition() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1000;

        assertEquals(cashbackHackService.remain(sum), 0);
    }
}