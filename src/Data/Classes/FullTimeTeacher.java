package Data.Classes;

import Data.Interfaces.Teacher;

public class FullTimeTeacher extends Person implements Teacher {

    private int experienceYears;
    private static double baseSalary = 40000;

    public FullTimeTeacher(String name, int id, int experienceYears) {
        super(name, id);
        this.experienceYears = experienceYears;
    }

    public double calculateSalary() {
        double experienceMultiplier = 1.10;
        return baseSalary * (1 + experienceMultiplier * this.experienceYears / 100);
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nYears of experience: " + experienceYears + "\nTotal salary: " + calculateSalary();
    }
}
