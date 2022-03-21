package main;

import java.util.ArrayList;

import api.EntityStorage;
import api.Item;

public class Player extends EntityStorage {
    public final int maxHp = 20;
    public final int hp = maxHp;
    ArrayList<Item> storage = new ArrayList<>();

    public Player() {
        super("Player");
    }
}
