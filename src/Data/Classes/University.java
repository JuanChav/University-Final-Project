package Data.Classes;

import Data.Interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<FullTimeTeacher> fullTeachers;
    private List<PartTimeTeacher> partTeachers;
    private List<Student> students;
    private List<Class> classes;

    public University(String name) {
        this.name = name;
        this.fullTeachers = new ArrayList<>();
        this.partTeachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    private void addFullTimeTeachers(FullTimeTeacher fullTimeTeacher) {
        this.fullTeachers.add(fullTimeTeacher);
    }

    private void addPartTimeTeachers(PartTimeTeacher partTimeTeacher) {
        this.partTeachers.add(partTimeTeacher);
    }

    private void addStudent(Student student) {
        this.students.add(student);
    }

    private void addClasses(Class class_) {
        this.classes.add(class_);
    }
}
