package Data.Classes;

public abstract class Person {

    protected String name;
    protected int id;

    protected Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    protected abstract String showData();

}
