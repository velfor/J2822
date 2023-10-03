package Lesson31;

public class Pet {
    protected String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

}
