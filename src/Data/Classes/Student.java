package Data.Classes;

public class Student extends Person {

    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age;
    }
}
