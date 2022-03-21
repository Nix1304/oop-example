package api;

/**
 * EntityStorage
 */
public class EntityStorage extends BaseStorage implements ILiving {
    private String name = "EntityStorage";

    public EntityStorage() {}

    public EntityStorage(String name) {
        this.name = name;
    }

    @Override
    public void spawn() {
        // TODO Auto-generated method stub
    }

    @Override
    public void kill() {
        // TODO Auto-generated method stub
    }

    @Override
    public void addToStorage(Item item) {
        this.storage.add(item);
        System.out.println(String.format("The item %s was added to %s", item.getName(), this.getName()));
    }

    @Override
    public Item consumeStorage(int index) {
        // Получение предмета под нужным индексокм
        Item removedElement = this.storage.get(index);
        // Удаление предмета под индексом
        this.storage.remove(index);
        // Возвращается удаленный предмет
        return removedElement;
    }

    @Override
    public Item moveToStorage(IStorage dest, int index) {
        // Получение удаленного предмета из первого хранилища
        Item item = this.consumeStorage(index);
        // Добавление предмета во второе хранилище
        dest.addToStorage(item);
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