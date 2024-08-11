package Data.Classes;

import Data.Interfaces.Teacher;

public class PartTimeTeacher extends Person implements Teacher {

    private int hoursWeek;

    private PartTimeTeacher(String name, int id, double baseSalary, int hoursWeek) {
        super(name, id, baseSalary);
        this.hoursWeek = hoursWeek;
    }

    public double calculateSalary() {
        return baseSalary * hoursWeek;
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nHours active this week: " + hoursWeek + "\nTotal salary: " + calculateSalary();
    }

}
