package api;

import java.util.ArrayList;

public class BaseStorage implements IStorage {
    // Объект списка хранимого
    ArrayList<Item> storage = new ArrayList<Item>();
    // Имя хранилища
    String name = "Unnamed storage";

    @Override
    public void addToStorage(Item item) {
        // Добавление предмета в хранилище
        this.storage.add(item);
    }
    
    public Item consumeStorage(int index) {
        // Получение предмета под нужным индексокм
        Item removedElement = this.storage.get(index);
        // Удаление предмета под индексом
        this.storage.remove(index);
        // Возвращается удаленный предмет
        return removedElement;
    }

    public Item moveToStorage(IStorage dest, int index) {
        // Получение удаленного предмета из первого хранилища
        Item item = this.consumeStorage(index);
        // Добавление предмета во второе хранилище
        dest.addToStorage(item);
        // Возвращение перемещенного предмета
        return item;
    }

    /**
     * Получение хранимого
     * @return ArrayList<Item> список предметов в хранилище
     */
    public ArrayList<Item> getStored() {
        return this.storage;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Получение количества хранимого
     * @return int количество хранимого
     */
    public int getStorageSize() {
        return this.storage.size();
    }
}
