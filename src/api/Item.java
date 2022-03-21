package api;

public class Item {
    private String name = new String();

    /**
     * Конструктор предмета
     * @param name String имя предмета
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Получение имени предмета
     * @return String имя предмета
     */
    public String getName() {
        return this.name;
    }
}
