package com.bewater.cording.interview.javaspring.postConstruct;

import org.springframework.stereotype.Component;

/**
 * @Author: bewater
 * @Date: Created in 14:15 2022/5/12
 */
@Component
public class ConstructA {
    private String name;
    private String game;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
}
