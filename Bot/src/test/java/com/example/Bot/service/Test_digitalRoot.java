package com.example.Bot.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_digitalRoot {
    @Test
    void test_digitalRoot1() {
        assertEquals(6, TelegramBot.digitalRoot(123));   // 1 + 2 + 3 = 6
    }
    @Test
    void test_digitalRoot2() {
        assertEquals(0, TelegramBot.digitalRoot(0));     // 0 = 0
    }
    @Test
    void test_digitalRoot3() {
        assertEquals(6, TelegramBot.digitalRoot(987));   // 9 + 8 + 7 = 24, 2 + 4 = 6
    }
    @Test
    void test_digitalRoot4() {
        assertEquals(9, TelegramBot.digitalRoot(999));   // 9 + 9 + 9 = 27, 2 + 7 = 9
    }
    @Test
    void test_digitalRoot5() {
        assertEquals(1, TelegramBot.digitalRoot(10));    // 1 + 0 = 1
    }
    @Test
    void test_digitalRoot6() {
        assertEquals(2, TelegramBot.digitalRoot(2));     //2 = 2
    }
}
