package Data.Classes;

public class Student extends Person {

    private int age, id;
    private static int cont = 0;

    public Student(String name, int age) {
        super(name);
        cont++;
        this.id = cont;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nAge: " + age;
    }
}
