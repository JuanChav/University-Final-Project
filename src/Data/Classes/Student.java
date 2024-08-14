package Data.Classes;

public class Student extends Person {

    private int age, id;
    private static int cont = 0;

    public Student(String name, int age) {
        super(name);
        this.cont++;
        this.id = this.cont;
        this.age = age;
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age;
    }
}
