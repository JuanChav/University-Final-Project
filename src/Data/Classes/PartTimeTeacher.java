package Data.Classes;

import Data.Interfaces.Teacher;

public class PartTimeTeacher extends Person implements Teacher {

    private PartTimeTeacher(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    protected String showData() {
        return "";
    }

    public double calculateSalary() {

        return 2;
    }


}
