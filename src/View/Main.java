package View;

import Data.Classes.DummyData;
import Data.Classes.Student;
import Data.Classes.Subject;
import Data.Classes.University;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        University university = new University("Uninorte");
        DummyData.initializeData(university);
        showMainMenu(university);
    }

    public static void showMainMenu(University university) {
        boolean ver = true;
        do {
            String option = JOptionPane.showInputDialog("Menu:\n" +
                    "1. Show all the professors\n" +
                    "2. Show all the classes\n" +
                    "3. Create a new student and add it to an existing class\n" +
                    "4. Create a new class\n" +
                    "5. List all the classes by student\n" +
                    "6. Exit\n\n" +
                    "Input an option:");

            switch (option) {
                case "1":
                    option1(university);
                    break;
                case "2":
                    option2(university);
                    break;
                case "3":
                    option3(university);
                    break;
                case "4":
                    option4(university);
                    break;
                case "5":
                    option5(university);
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    ver = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input");
            }

        } while (ver);
    }

    public static void option1(University university) {
        JOptionPane.showMessageDialog(null, university.showAllTeachers());
        university.showAllTeachers();
    }

    public static void option2(University university) {
        JOptionPane.showMessageDialog(null, university.showAllSubjects());
        JComboBox<String> comboBox = new JComboBox<>(university.showAllSubjectsNames());
        comboBox.setSelectedIndex(0);

        JOptionPane.showMessageDialog(
                null,
                comboBox,
                "Select the subject you want to see more info:",
                JOptionPane.PLAIN_MESSAGE
        );

        int sub = comboBox.getSelectedIndex();
        JOptionPane.showMessageDialog(null, university.getSubject(sub).showData(sub));
    }

    public static void option3(University university) {
        String name = JOptionPane.showInputDialog("Input the student's name:");
        String ageInput = JOptionPane.showInputDialog("Input the student's age:");
        int age = Integer.parseInt(ageInput);
        Student student = new Student(name, age);
        university.addStudent(student);

        JComboBox<String> comboBox = new JComboBox<>(university.showAllSubjectsNames());
        comboBox.setSelectedIndex(0);

        JOptionPane.showMessageDialog(
                null,
                comboBox,
                "Select the subject:",
                JOptionPane.PLAIN_MESSAGE
        );

        int sub = comboBox.getSelectedIndex();
        university.getSubject(sub).addStudent(student);
    }

    public static void option4(University university) {
        String subjectName = JOptionPane.showInputDialog("Input the subject's name:");
        String subjectCR = JOptionPane.showInputDialog("Input the subject classroom:");
        Subject subject = new Subject(subjectName, subjectCR);
        university.addSubjects(subject);

        String[] teacherTypes = {"Full time", "Part time"};
        String teacherTypeInput = (String) JOptionPane.showInputDialog(
                null,
                "The teacher is going to be full-time or part-time?",
                "Teacher types:",
                JOptionPane.PLAIN_MESSAGE,
                null,
                teacherTypes,
                teacherTypes[0]
        );

        int teacherModality = 0;
        if (Objects.equals(teacherTypeInput, "Full time")) {
            teacherModality = 1;
        } else {
            teacherModality = 2;
        }

        if (teacherModality == 1) {
            JComboBox<String> comboBox = new JComboBox<>(university.showFullTimeTeachers());
            comboBox.setSelectedIndex(0);

            JOptionPane.showMessageDialog(
                    null,
                    comboBox,
                    "Select the teacher:",
                    JOptionPane.PLAIN_MESSAGE
            );

            int idTeacher = comboBox.getSelectedIndex();
            subject.setFullTeacher(university.getFullTeachers(idTeacher));
        } else {
            JComboBox<String> comboBox = new JComboBox<>(university.showPartTimeTeachers());
            comboBox.setSelectedIndex(0);

            JOptionPane.showMessageDialog(
                    null,
                    comboBox,
                    "Select the teacher:",
                    JOptionPane.PLAIN_MESSAGE
            );

            int idTeacher = comboBox.getSelectedIndex();
            subject.setPartTeacher(university.getPartTeachers(idTeacher));
        }
        int verf;
        do {
            JComboBox<String> comboBox = new JComboBox<>(university.showAllStudents());
            comboBox.setSelectedIndex(0);

            JOptionPane.showMessageDialog(
                    null,
                    comboBox,
                    "Select a student:",
                    JOptionPane.PLAIN_MESSAGE
            );

            int idStudent = comboBox.getSelectedIndex();
            int verf2 = 0;
            while (verf2 == 0) {
                if (subject.verifyIfStudentIsInSubject(idStudent + 1)) {
                    JOptionPane.showMessageDialog(null, "The student is already listed in the subject.");
                    comboBox = new JComboBox<>(university.showAllStudents());
                    comboBox.setSelectedIndex(0);

                    JOptionPane.showMessageDialog(
                            null,
                            comboBox,
                            "Select a student:",
                            JOptionPane.PLAIN_MESSAGE
                    );

                    idStudent = comboBox.getSelectedIndex();
                } else {
                    verf2 = 1;
                }
            }
            subject.addStudent(university.getStudent(idStudent));
            String[] optionsYesNo = {"Yes", "No"};
            String verifyIfMoreStudents = (String) JOptionPane.showInputDialog(
                    null,
                    "Do you want to add a new student to the subject?",
                    "",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    optionsYesNo,
                    optionsYesNo[0]
            );

            if (Objects.equals(verifyIfMoreStudents, "Yes")) {
                verf = 1;
            } else {
                verf = 2;
            }
        } while (verf == 1);
    }

    public static void option5(University university) {
        JComboBox<String> comboBox = new JComboBox<>(university.showAllStudents());
        comboBox.setSelectedIndex(0);

        JOptionPane.showMessageDialog(
                null,
                comboBox,
                "Select the student you want to search:",
                JOptionPane.PLAIN_MESSAGE
        );

        int idStudent = comboBox.getSelectedIndex();
        JOptionPane.showMessageDialog(null, university.showHowManySubjectsAStudentHas(idStudent + 1));
    }

}