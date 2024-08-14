package Data.Classes;

public class Student extends Person {

    private int age;

    public Student(String name, int id, int age) {
        super(name, id);
        this.age = age;
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age;
    }
}
