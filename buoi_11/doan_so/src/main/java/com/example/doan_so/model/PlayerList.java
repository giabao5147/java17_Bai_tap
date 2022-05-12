package com.example.doan_so.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    private List<Player> list;

    public PlayerList() {
        list = new ArrayList<>();
    }

    public PlayerList(List<Player> playerList) {
        list = playerList;
    }

    public void addPlayer(Player player) {
        list.add(player);
    }

    public List<Player> getList() {
        return list;
    }

    public void setList(List<Player> list) {
        this.list = list;
    }
}
