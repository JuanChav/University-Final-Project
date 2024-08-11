package Data.Classes;

import Data.Interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private String name, assignedClassroom;
    private List<Student> students;
    private Teacher teacher;

    public Class(String name, String assignedClassroom, Teacher teacher) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    private void addStudent(Student student) {
        this.students.add(student);
    }

}
