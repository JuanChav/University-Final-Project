package Data.Classes;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name, assignedClassroom;
    private List<Student> students;
    private FullTimeTeacher fullTeacher;
    private PartTimeTeacher partTeacher;

    public Subject(String name, String assignedClassroom) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.students = new ArrayList<>();
    }

    protected void setFullTeacher(FullTimeTeacher fullTeacher) {
        this.fullTeacher = fullTeacher;
    }

    protected void setPartTeacher(PartTimeTeacher partTeacher) {
        this.partTeacher = partTeacher;
    }

    protected void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAssigned classroom: " + assignedClassroom;
    }

    public String showData() {
        String studentList = "";
        for (Student student: students) {
            studentList = student + "\n";
        }
        return "Teacher: " + fullTeacher + "\nList of students";
    }

}
