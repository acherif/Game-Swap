package com.example.hamid.sharevid.constants;

/**
 * Created by hamid on 27/06/2016.
 */
public enum GameState {
    AsNew("As new"),
    Good("Good"),
    Medium("Medium"),
    Bad("Bad");

    private String value;

    GameState(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
