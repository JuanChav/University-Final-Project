package Data.Classes;

import Data.Interfaces.Teacher;

public class FullTimeTeacher extends Person implements Teacher {

    private int experienceYears;

    private FullTimeTeacher(String name, int id, double baseSalary, int experienceYears) {
        super(name, id, baseSalary);
        this.experienceYears = experienceYears;
    }

    public double calculateSalary() {
        double experienceMultiplier = 1.10;
        return this.baseSalary * (1 + experienceMultiplier * this.experienceYears / 100);
    }

    @Override
    public String showData() {
        return "ID: " + id + "\nName: " + name + "\nYears of experience: " + experienceYears + "\nTotal salary: " + calculateSalary();
    }
}
