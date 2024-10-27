package com.example.Bot.config;
//Класс BotConfig служит для загрузки и предоставления конфигурационных данных (имя и токен бота) в других частях приложения
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {

    @Value("${bot.name}")
    String botName;

    @Value("${bot.token}")
    String token;

    public String getName() {
        return botName;
    }

    public String getToken() {
        return token;
    }
}
