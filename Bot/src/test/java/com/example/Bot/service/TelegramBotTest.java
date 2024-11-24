package com.example.Bot.service;

import com.example.Bot.config.BotConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelegramBotTest {
    BotConfig botConfig = new BotConfig();
    private TelegramBot telegramBot = new TelegramBot(botConfig);

    @Test
    public void test_LifePathNumber() {

        String date1 = "01-01-2000";
        assertEquals(4, telegramBot.lifePathNumber(date1));

        String date2 = "12-12-1990";
        assertEquals(7, telegramBot.lifePathNumber(date2));

        String date3 = "29-02-2000";
        assertEquals(6, telegramBot.lifePathNumber(date3));

        String date4 = "31-12-1999";
        assertEquals(8, telegramBot.lifePathNumber(date4));

        String date5 = "01-01-2001";
        assertEquals(5, telegramBot.lifePathNumber(date5));

        String date6 = "25-08-1997";
        assertEquals(5, telegramBot.lifePathNumber(date6));

    }
    @Test
    void test_TaroArcana() {
        assertEquals(4, telegramBot.TaroArcana("01.01.2000"));
        assertEquals(16, telegramBot.TaroArcana("15.08.1995"));
        assertEquals(17, telegramBot.TaroArcana("29.02.2020"));
        assertEquals(13, telegramBot.TaroArcana("31.12.1999"));
        assertEquals(14, telegramBot.TaroArcana("01.06.2005"));
        assertEquals(16, telegramBot.TaroArcana("16.12.2004"));
        assertEquals(19, telegramBot.TaroArcana("25.08.1997"));
    }
}