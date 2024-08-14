package Data.Classes;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<FullTimeTeacher> fullTeachers;
    private List<PartTimeTeacher> partTeachers;
    private List<Student> students;
    private List<Subject> subjects;

    public University(String name) {
        this.name = name;
        this.fullTeachers = new ArrayList<>();
        this.partTeachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    protected void addFullTimeTeachers(FullTimeTeacher fullTimeTeacher) {
        this.fullTeachers.add(fullTimeTeacher);
    }

    protected void addPartTimeTeachers(PartTimeTeacher partTimeTeacher) {
        this.partTeachers.add(partTimeTeacher);
    }

    protected void addStudent(Student student) {
        this.students.add(student);
    }

    protected void addSubjects(Subject subject) {
        this.subjects.add(subject);
    }
}
