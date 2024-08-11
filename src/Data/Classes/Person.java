package Data.Classes;

public abstract class Person {

    protected String name;
    protected int id, age;
    protected double baseSalary;

    protected Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    protected Person(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    protected abstract String showData();

}
