package com.example.Bot.service;

import com.example.Bot.config.BotConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_TaroArcana {
    BotConfig botConfig = new BotConfig();
    private TelegramBot telegramBot = new TelegramBot(botConfig);
    @Test
    void test_TaroArcana1() {
        assertEquals(4, telegramBot.TaroArcana("01.01.2000"));
    }
    @Test
    void test_TaroArcana2() {
        assertEquals(16, telegramBot.TaroArcana("15.08.1995"));
    }
    @Test
    void test_TaroArcana3() {
        assertEquals(17, telegramBot.TaroArcana("29.02.2020"));
    }
    @Test
    void test_TaroArcana4() {
        assertEquals(13, telegramBot.TaroArcana("31.12.1999"));
    }
    @Test
    void test_TaroArcana5() {
        assertEquals(14, telegramBot.TaroArcana("01.06.2005"));
    }
    @Test
    void test_TaroArcana6() {
        assertEquals(16, telegramBot.TaroArcana("16.12.2004"));
    }
    @Test
    void test_TaroArcana7() {
        assertEquals(19, telegramBot.TaroArcana("25.08.1997"));
    }
}
