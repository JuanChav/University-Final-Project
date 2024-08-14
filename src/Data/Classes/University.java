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

    public void showAllProfessors() {
        System.out.println("Full-time Teachers:");
        for (FullTimeTeacher teacher : this.fullTeachers) {
            System.out.println(teacher.showData());
        }
        System.out.println("Part-time Teachers:");
        for (PartTimeTeacher teacher : this.partTeachers) {
            System.out.println(teacher.showData());
        }
    }

    public void showAllSubjects() {
        System.out.println("Classes");
        for (Subject subject : this.subjects) {
            System.out.println(subject);
        }
    }


}
