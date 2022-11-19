package com.springbootinaction.readinglist;

import com.springbootinaction.readinglist.config.TestConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadingListApplication implements ApplicationRunner {

    @Autowired
    private TestConfig testConfig;

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(testConfig.getLevels());
    }
}
