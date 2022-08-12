package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnTheMissingAmountToReceiveACashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 900;

        assertEquals(cashbackHackService.remain(sum), 100);
    }

    @Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfMoreThan1000AreSpent() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1050;

        assertEquals(cashbackHackService.remain(sum), 950);
    }

    @Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfNothingNeedsToBeBoughtInAddition() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1000;

        assertEquals(cashbackHackService.remain(sum), 0);
    }
}