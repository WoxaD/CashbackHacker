package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnTheMissingAmountToReceiveACashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 900;

        assertEquals(100, cashbackHackService.remain(sum));
    }

    @Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfMoreThan1000AreSpent() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1050;

        assertEquals(950, cashbackHackService.remain(sum));
    }

    @Test
    public void shouldReturnTheMissingAmountToReceiveACashbackIfNothingNeedsToBeBoughtInAddition() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1000;

        assertEquals(0, cashbackHackService.remain(sum));
    }
}