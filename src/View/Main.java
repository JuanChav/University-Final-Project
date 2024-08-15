package View;

import Data.Classes.DummyData;
import Data.Classes.Student;
import Data.Classes.Subject;
import Data.Classes.University;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University university = new University("Uninorte");
        DummyData.initializeData(university);
        showMainMenu(university);
    }

    public static void showMainMenu(University university) {
        boolean ver = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Show all the professors");
            System.out.println("2. Show all the classes");
            System.out.println("3. Create a new student and add it to an existing class");
            System.out.println("4. Create a new class");
            System.out.println("5. List all the classes by student");
            System.out.println("6. Exit");

            System.out.print("Input an option: ");
            String option = scanner.next();

            switch (option) {
                case "1":
                    university.showAllTeachers();
                    break;
                case "2":
                    university.showAllSubjects();
                    System.out.println("Input the subject you wanna see more info: ");
                    university.showAllSubjectsNames();
                    int sub = scanner.nextInt();
                    System.out.println(university.getSubject(sub - 1).showData(sub));
                    break;
                case "3":
                    System.out.println("Input the student's name: ");
                    String name = scanner.next();
                    System.out.println("Input the student's age: ");
                    int age = scanner.nextInt();
                    Student student = new Student(name, age);
                    university.addStudent(student);
                    System.out.println("Input the subject:");
                    university.showAllSubjectsNames();
                    sub = scanner.nextInt();
                    university.getSubject(sub - 1).addStudent(student);
                    break;
                case "4":
                    System.out.println("Input the subject's name");
                    String subjectName = scanner.next();
                    System.out.println("Input the subject classroom: ");
                    String subjectCR = scanner.next();
                    Subject subject = new Subject(subjectName, subjectCR);
                    university.addSubjects(subject);
                    System.out.println("The teacher is gonna be a full o part time?\n1. Full time\n2. Part time");
                    int teacherModality = scanner.nextInt();
                    if (teacherModality == 1) {
                        university.showFullTimeTeachers();
                        System.out.println("What teacher is going to teach this subject (Input the ID)");
                        int idTeacher = scanner.nextInt();
                        subject.setFullTeacher(university.getFullTeachers(idTeacher - 1));
                    } else {
                        university.showPartTimeTeachers();
                        System.out.println("What teacher is going to teach this subject (Input the ID)");
                        int idTeacher = scanner.nextInt();
                        subject.setPartTeacher(university.getPartTeachers(idTeacher - 1));
                    }
                    int verf;
                    do {
                        university.showAllStudents();
                        System.out.println("Input the ID of the student");
                        int id_ = scanner.nextInt();
                        int verf2 = 0;
                        while (verf2 == 0) {
                             if (subject.verifyIfStudentIsInSubject(id_)) {
                                 System.out.println("The student is alredy list in the subject");
                                 System.out.println("Input the ID of the student");
                                 id_ = scanner.nextInt();
                             } else {
                                 verf2 = 1;
                             }
                        }
                        subject.addStudent(university.getStudent(id_ - 1));
                        System.out.println("Do you want to add a new student in the subject?\n1. Yes\n2. No");
                        verf = scanner.nextInt();
                    } while (verf == 1);
                    break;
                case "5":
                    university.showAllStudents();
                    System.out.println("Input the ID of the student yoy wanna search: ");
                    int id_ = scanner.nextInt();
                    university.showHowManySubjectsAStudentHas(id_);
                    break;
                case "6":
                    System.out.println("Exiting...");
                    ver = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }

        } while (ver);
    }

}