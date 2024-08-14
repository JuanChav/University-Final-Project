package View;

import Data.Classes.DummyData;
import Data.Classes.Student;
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
                    university.showAllProfessors();
                    break;
                case "2":
                    university.showAllSubjects();
                    System.out.println("Input the subject you wanna see more info: \n1. Math\n2. Science\n3. English\n4. History");
                    int sub = scanner.nextInt();
                    System.out.println(university.getSubject(sub - 1).showData(sub));
                    break;
                case "3":
                    System.out.println("Input the student's name: ");
                    String name = scanner.next();
                    System.out.println("Input the student's age: ");
                    int age = scanner.nextInt();
                    Student student = new Student(name, age);
                    System.out.println("Input the subject: \n1. Math\n2. Science\n3. English\n4. History");
                    int subj = scanner.nextInt();
                    university.getSubject(subj - 1).showData(subj);
                    break;
                case "4":
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("");
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

    private static void initializeUniversity() {

    }

}