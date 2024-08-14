package Data.Classes;

import Data.Interfaces.Teacher;

public class PartTimeTeacher extends Person implements Teacher {

    private int hoursWeek;
    private static double baseSalary = 12000;

    public PartTimeTeacher(String name, int id, int hoursWeek) {
        super(name, id);
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
