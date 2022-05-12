package com.example.doan_so.model;

public class Player {
    private String userName;
    private int numberOfGuesses;

    public Player(String userName, int numberOfGuesses) {
        this.userName = userName;
        this.numberOfGuesses = numberOfGuesses;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
}
