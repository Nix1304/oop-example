package main;

import api.*;


public class Chest extends BaseStorage {
    String name = "";
    int maxCapacity = 0;

    /**
     * Конструктор {@link Chest}
     * @param name String Имя сундука
     * @param maxCapacity int Максимальная вместимость
     */
    public Chest(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    /**
     * Конструктор {@link Chest}
     * @param maxCapacity
     */
    public Chest(int maxCapacity) {
        this.name = "Unnamed Chest";
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void addToStorage(Item item) {
        // проверяем, что можем ещё положить в хранилище

        // если не можем
        if(this.getStorageSize() >= this.maxCapacity) {
            // выводим ошибку
            System.err.println("Storage overflow");
        } else {
            // вызываем метод из родительского класса `BaseStorage`
            super.addToStorage(item);
            // выводим сообщение, что все успешно добавилось
            System.out.println(String.format("The item %s was added to %s", item.getName(), this.name));
        }
    }

    @Override
    public Item consumeStorage(int index) {
        return super.consumeStorage(index);
    }

    @Override
    public Item moveToStorage(IStorage dest, int index) {
        // вызов родительского метода
        Item item = super.moveToStorage(dest, index);
        // выводим сообщение, что все успешно перенеслось
        System.out.println(String.format("The item %s was moved from %s to %s", item.getName(), this.name, dest.getName()));
        // возвращаем перемещенный предмет
        return item;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
