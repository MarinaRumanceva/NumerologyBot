package com.example.Bot.service;

import com.example.Bot.config.BotConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelegramBotTest1 {
    BotConfig botConfig = new BotConfig();
    private TelegramBot telegramBot1 = new TelegramBot(botConfig);

    @Test
    void test_sumOfDigits() {
        assertEquals(6, TelegramBot.sumOfDigits(123));   // 1 + 2 + 3 = 6
        assertEquals(0,  TelegramBot.sumOfDigits(0));    // 0 = 0
        assertEquals(24, TelegramBot.sumOfDigits(789));  // 7 + 8 + 9 = 24
        assertEquals(10, TelegramBot.sumOfDigits(55));   // 5 + 5 = 10
        assertEquals(27, TelegramBot.sumOfDigits(999));  // 9 + 9 + 9 = 27
    }

    @Test
    void test_digitalRoot() {
        assertEquals(6, TelegramBot.digitalRoot(123));   // 1 + 2 + 3 = 6
        assertEquals(0, TelegramBot.digitalRoot(0));     // 0 = 0
        assertEquals(6, TelegramBot.digitalRoot(987));   // 9 + 8 + 7 = 24, 2 + 4 = 6
        assertEquals(9, TelegramBot.digitalRoot(999));   // 9 + 9 + 9 = 27, 2 + 7 = 9
        assertEquals(1, TelegramBot.digitalRoot(10));    // 1 + 0 = 1
        assertEquals(2, TelegramBot.digitalRoot(2));     //2 = 2
    }

    @Test
    void test_calculatePythagoreanSquare() {
        int[] result1 = TelegramBot.calculatePythagoreanSquare("01.01.2000");
        assertArrayEquals(new int[]{2, 3, 0, 2, 0, 0, 0, 0, 0}, result1);

        int[] result2 = TelegramBot.calculatePythagoreanSquare("01.06.2005");
        assertArrayEquals(new int[]{3, 2, 1, 1, 2, 1, 0, 0, 0}, result2);

        int[] result3 = TelegramBot.calculatePythagoreanSquare("29.02.2020");
        assertArrayEquals(new int[]{2, 4, 1, 1, 0, 0, 1, 1, 1}, result3);

        int[] result4 = TelegramBot.calculatePythagoreanSquare("10.10.2010");
        assertArrayEquals(new int[]{3, 1, 2, 0, 2, 0, 0, 0, 0}, result4);

        int[] result5 = TelegramBot.calculatePythagoreanSquare("16.12.2004");
        assertArrayEquals(new int[]{4, 2, 0, 2, 1, 2, 1, 0, 0}, result5);

        int[] result6 = TelegramBot.calculatePythagoreanSquare("30.09.2005");
        assertArrayEquals(new int[]{3, 1, 2, 1, 1, 0, 0, 0, 2}, result6);
    }

}