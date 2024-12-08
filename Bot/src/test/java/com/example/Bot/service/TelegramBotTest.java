package com.example.Bot.service;

import com.example.Bot.config.BotConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelegramBotTest {
    BotConfig botConfig = new BotConfig();
    private TelegramBot telegramBot = new TelegramBot(botConfig);

    @Test
    public void test_LifePathNumber1() {

        String date1 = "01-01-2000";
        assertEquals(4, telegramBot.lifePathNumber(date1));
    }
    @Test
    public void test_LifePathNumber2() {

        String date2 = "12-12-1990";
        assertEquals(7, telegramBot.lifePathNumber(date2));
    }
    @Test
    public void test_LifePathNumber3() {

        String date3 = "29-02-2000";
        assertEquals(6, telegramBot.lifePathNumber(date3));
    }
    @Test
    public void test_LifePathNumber4() {

        String date4 = "31-12-1999";
        assertEquals(8, telegramBot.lifePathNumber(date4));
    }
    @Test
    public void test_LifePathNumber5() {

        String date5 = "01-01-2001";
        assertEquals(5, telegramBot.lifePathNumber(date5));
    }
    @Test
    public void test_LifePathNumber6() {

        String date6 = "25-08-1997";
        assertEquals(5, telegramBot.lifePathNumber(date6));
    }
}