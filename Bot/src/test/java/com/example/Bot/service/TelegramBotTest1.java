package com.example.Bot.service;

import com.example.Bot.config.BotConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelegramBotTest1 {
    BotConfig botConfig = new BotConfig();
    private TelegramBot telegramBot1 = new TelegramBot(botConfig);

    @Test
    void test_sumOfDigits1() {
        assertEquals(6, TelegramBot.sumOfDigits(123));   // 1 + 2 + 3 = 6
    }
    @Test
    void test_sumOfDigits2() {
        assertEquals(0,  TelegramBot.sumOfDigits(0));    // 0 = 0
    }
    @Test
    void test_sumOfDigits3() {
        assertEquals(24, TelegramBot.sumOfDigits(789));  // 7 + 8 + 9 = 24
    }
    @Test
    void test_sumOfDigits4() {
        assertEquals(10, TelegramBot.sumOfDigits(55));   // 5 + 5 = 10
    }
    @Test
    void test_sumOfDigits5() {
        assertEquals(27, TelegramBot.sumOfDigits(999));  // 9 + 9 + 9 = 27
    }
}