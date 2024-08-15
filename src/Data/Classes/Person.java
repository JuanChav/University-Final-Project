package Data.Classes;

public abstract class Person {

    protected String name;
    protected int idTeacher;
    protected static int count = 0;

    protected Person(String name) {
        this.name = name;
    }

    protected abstract String showData();

}
