package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LevelController {


    private int levelNumber;

    public void setLevelNumber(@Value("${levelNumber}")int levelNumber) {
        this.levelNumber = levelNumber;
    }

    @GetMapping("/level")
    public String getLevel() {
        return levelNumber < 1 ? "basic" : "advanced";
    }
}
