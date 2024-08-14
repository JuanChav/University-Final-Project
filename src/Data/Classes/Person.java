package Data.Classes;

public abstract class Person {

    protected String name;
    protected int id;

    protected Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    protected abstract String showData();

}
