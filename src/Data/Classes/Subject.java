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

    public String getName() {
        return name;
    }

    public void setFullTeacher(FullTimeTeacher fullTeacher) {
        this.fullTeacher = fullTeacher;
    }

    public void setPartTeacher(PartTimeTeacher partTeacher) {
        this.partTeacher = partTeacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAssigned classroom: " + assignedClassroom;
    }

    public String showData(int conf) {
        StringBuilder studentList = new StringBuilder();
        for (Student student: students) {
            studentList.append(student.showData()).append("\n");
        }
        if (partTeacher == null) {
            return "Teacher: \n" + fullTeacher.showData() + "\nList of students:\n" + studentList;
        }
        return "Teacher: \n" + partTeacher.showData() + "\nList of students:\n" + studentList;
    }

    protected String showStudentSubjects(int idStudent) {
        for (Student student: students) {
            if (student.getId() == idStudent) {
                return "The student is list in: " + this.name;
            }
        }
        return "";
    }

    public boolean verifyIfStudentIsInSubject(int idStudent) {
        for (Student student: students) {
            if (student.getId() == idStudent) {
                return true;
            }
        }
        return false;
    }

}
