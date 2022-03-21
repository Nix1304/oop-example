package api;

public interface IStorage {
    /**
     * @param item {@link Item} предмет который будем добавлять в хранилище
     */
    public void addToStorage(Item item);

    /**
     * @param index int индекс предмета для удаления
     */
    public Item consumeStorage(int index);
    
    /**
     * @param dest {@link IStorage} целевое хранилище для перемещения
     * @param index int индекс предмета из исходного хранилища
     */
    public Item moveToStorage(IStorage dest, int index);

    /**
     * Получение имени хранилища
     * @return String имя предмета
     */
    public String getName();
}
