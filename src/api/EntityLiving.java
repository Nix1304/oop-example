package api;

public class EntityLiving implements ILiving {
    String name = "Entity";

    public EntityLiving() {}

    public EntityLiving(String name) {
        this.name = name;
    }

    @Override
    public void spawn() {
        System.out.println(String.format("The %s was spawned", this.name));
    }

    @Override
    public void kill() {
        System.out.println(String.format("The %s was killed", this.name));
    }

    public String getEntityName() {
        return this.name;
    }
}
