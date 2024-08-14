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
        if (conf == 1 || conf == 2) {
            return "Teacher: \n" + fullTeacher.showData() + "\nList of students:\n" + studentList;
        }
        return "Teacher: \n" + partTeacher.showData() + "\nList of students:\n" + studentList;
    }

    protected void verifyStudent(int idStudent) {
        for (Student student: students) {
            if (student.getId() == idStudent) {
                System.out.println("The student is list in: " + this.name);
            }
        }
    }

}
