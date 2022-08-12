package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void shouldReturnTheMissingAmountToReceiveACashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 900;

        assertEquals(cashbackHackService.remain(sum), 100);
    }

    @org.testng.annotations.Test
    void shouldReturnTheMissingAmountToReceiveACashbackIfMoreThan1000AreSpent() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1050;

        assertEquals(cashbackHackService.remain(sum), 950);
    }

    @org.testng.annotations.Test
    void shouldReturnTheMissingAmountToReceiveACashbackIfNothingNeedsToBeBoughtInAddition() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1000;

        assertEquals(cashbackHackService.remain(sum), 0);
    }
}