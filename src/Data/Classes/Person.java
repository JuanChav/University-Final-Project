package Data.Classes;

public abstract class Person {

    protected String name;

    protected Person(String name) {
        this.name = name;
    }

    protected abstract String showData();

}
