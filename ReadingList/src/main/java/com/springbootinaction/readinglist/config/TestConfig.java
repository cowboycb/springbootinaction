package com.springbootinaction.readinglist.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;

@Configuration
@Getter
public class TestConfig {
    @Value("#{'${deneme-levels:}'.split(';')}")
    private List<String> levels;
}
