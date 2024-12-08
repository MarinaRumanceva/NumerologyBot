package com.example.Bot.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test_Square {
    @Test
    void test_calculatePythagoreanSquare1() {
        int[] result1 = TelegramBot.calculatePythagoreanSquare("01.01.2000");
        assertArrayEquals(new int[]{2, 3, 0, 2, 0, 0, 0, 0, 0}, result1);
    }
    @Test
    void test_calculatePythagoreanSquare2() {
        int[] result2 = TelegramBot.calculatePythagoreanSquare("01.06.2005");
        assertArrayEquals(new int[]{3, 2, 1, 1, 2, 1, 0, 0, 0}, result2);
    }
    @Test
    void test_calculatePythagoreanSquare3() {
        int[] result3 = TelegramBot.calculatePythagoreanSquare("29.02.2020");
        assertArrayEquals(new int[]{2, 4, 1, 1, 0, 0, 1, 1, 1}, result3);
    }
    @Test
    void test_calculatePythagoreanSquare4() {
        int[] result4 = TelegramBot.calculatePythagoreanSquare("10.10.2010");
        assertArrayEquals(new int[]{3, 1, 2, 0, 2, 0, 0, 0, 0}, result4);
    }
    @Test
    void test_calculatePythagoreanSquare5() {
        int[] result5 = TelegramBot.calculatePythagoreanSquare("16.12.2004");
        assertArrayEquals(new int[]{4, 2, 0, 2, 1, 2, 1, 0, 0}, result5);
    }
    @Test
    void test_calculatePythagoreanSquare6() {
        int[] result6 = TelegramBot.calculatePythagoreanSquare("30.09.2005");
        assertArrayEquals(new int[]{3, 1, 2, 1, 1, 0, 0, 0, 2}, result6);
    }
}
