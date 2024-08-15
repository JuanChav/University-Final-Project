package Data.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Subject getSubject(int index) {
        return subjects.get(index);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public FullTimeTeacher getFullTeachers(int index) {
        return fullTeachers.get(index);
    }

    public PartTimeTeacher getPartTeachers(int index) {
        return partTeachers.get(index);
    }

    protected void addFullTimeTeachers(FullTimeTeacher fullTimeTeacher) {
        this.fullTeachers.add(fullTimeTeacher);
    }

    protected void addPartTimeTeachers(PartTimeTeacher partTimeTeacher) {
        this.partTeachers.add(partTimeTeacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addSubjects(Subject subject) {
        this.subjects.add(subject);
    }

    public String showAllTeachers() {
        StringBuilder teacherList = new StringBuilder();
        teacherList.append("\nFull-time Teachers:").append("\n");
        for (FullTimeTeacher teacher : this.fullTeachers) {
            teacherList.append(teacher.showData()).append("\n");
        }
        teacherList.append("\nPart-time Teachers:").append("\n");
        for (PartTimeTeacher teacher : this.partTeachers) {
            teacherList.append(teacher.showData()).append("\n");
        }
        return "List of teachers: \n" + teacherList;
    }

    public String[] showFullTimeTeachers() {
        StringBuilder teacherList = new StringBuilder();
        for (FullTimeTeacher teacher : this.fullTeachers) {
            teacherList.append(teacher.getName()).append("-");
        }
        return teacherList.toString().split("-");
    }

    public String[] showPartTimeTeachers() {
        StringBuilder teacherList = new StringBuilder();
        for (PartTimeTeacher teacher : this.partTeachers) {
            teacherList.append(teacher.getName()).append("-");
        }
        return teacherList.toString().split("-");
    }

    public String[] showAllStudents() {
        StringBuilder studentList = new StringBuilder();
        for (Student student: students) {
            studentList.append(student.getName()).append("-");
        }
        return studentList.toString().split("-");
    }

    public String showAllSubjects() {
        StringBuilder subjectList = new StringBuilder();
        for (Subject subject : this.subjects) {
            subjectList.append(subject).append("\n");
        }
        return "Subjects: \n" + subjectList;
    }

    public String[] showAllSubjectsNames() {
        StringBuilder subjectNameList = new StringBuilder();
        for (Subject subject : this.subjects) {
            subjectNameList.append(subject.getName()).append("-");
        }
        return subjectNameList.toString().split("-");
    }

    public String showHowManySubjectsAStudentHas(int idStudent) {
        StringBuilder subjectList = new StringBuilder();
        for (Subject subject : this.subjects) {
            if (!Objects.equals(subject.showStudentSubjects(idStudent), "")) {
                subjectList.append(subject.showStudentSubjects(idStudent)).append("\n");
            }
        }
        return "Subjects: \n" + subjectList;
    }

}
