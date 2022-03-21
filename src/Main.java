import java.util.stream.Collectors;

import api.*;
import main.*;

public class Main {
    // Создание трех объектов предметов
    static Item apple = new Item("Apple");
    static Item banana = new Item("Banana");
    static Item strawberry = new Item("Strawberry");

    // Создание двух хранилищ
    static Chest chest1 = new Chest("Chest", 4);
    static Chest chest2 = new Chest("Large chest", 8);

    // Создание игрока
    static Player player = new Player();

    public static void main(String[] args) {
        // Добавление предметов в хранилище
        chest1.addToStorage(apple);
        chest1.addToStorage(apple);
        chest1.addToStorage(apple);
        chest1.addToStorage(apple);

        // Это добавление сверх максимальной вместимости, поэтому оно не добавится и выведет ошибку
        chest1.addToStorage(strawberry);

        // Перемещение первого предмета из одного сундука в другой
        chest1.moveToStorage(chest2, 0);
        chest1.addToStorage(strawberry);
        chest1.addToStorage(apple);

        // Перемещение предмета в инвентарь игрока
        chest1.moveToStorage(player, 0);

        // выводим пустую строку
        System.out.println();
        System.out.println(String.format("Player HP %d/%d", player.hp, player.maxHp));

        // Вывод хранимого
        System.out.println(String.format("%s: %s", player.getName(), player.getStored().stream().map(i -> i.getName()).collect(Collectors.toList())).toString());
        System.out.println(String.format("%s: %s", chest1.getName(), chest1.getStored().stream().map(i -> i.getName()).collect(Collectors.toList())).toString());
        System.out.println(String.format("%s: %s", chest2.getName(), chest2.getStored().stream().map(i -> i.getName()).collect(Collectors.toList())).toString());
    }
}