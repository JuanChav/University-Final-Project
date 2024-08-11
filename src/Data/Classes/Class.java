package Data.Classes;

import Data.Interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private String name, assignedClassroom;
    private List<Student> students;
    private FullTimeTeacher fullTeacher;
    private PartTimeTeacher partTeacher;

    public Class(String name, String assignedClassroom) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.students = new ArrayList<>();
    }

    public void setFullTeacher(FullTimeTeacher fullTeacher) {
        this.fullTeacher = fullTeacher;
    }

    public void setPartTeacher(PartTimeTeacher partTeacher) {
        this.partTeacher = partTeacher;
    }

    private void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nAssigned classroom: " + assignedClassroom;
    }

}
