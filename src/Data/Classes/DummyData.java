package Data.Classes;

public class DummyData {

    public static void initializeData(University university) {
        Student student1 = new Student("Angelia Chavey", 1, 26);
        Student student2 = new Student("Leena Blackmoor", 2, 22);
        Student student3 = new Student("Ellwood Berryann", 3, 21);
        Student student4 = new Student("Heindrick Windrum", 4, 18);
        Student student5 = new Student("Florida Gecksy", 5, 22);
        Student student6 = new Student("Doretta MacCafferky", 6, 19);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("Nicola Menzies", 1, 25);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher("Stefania Banger", 2, 28);

        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("Neda Hyam", 1, 8);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher("Krishna Meddows", 2, 12);

        Subject math = new Subject("Math", "A1");
        math.setFullTeacher(fullTimeTeacher2);
        math.addStudent(student1);
        math.addStudent(student2);
        math.addStudent(student3);

        Subject science = new Subject("Science", "A2");
        science.setFullTeacher(fullTimeTeacher1);
        science.addStudent(student4);
        science.addStudent(student5);
        science.addStudent(student6);

        Subject english = new Subject("English", "B1");
        english.setPartTeacher(partTimeTeacher1);
        english.addStudent(student1);
        english.addStudent(student3);
        english.addStudent(student5);

        Subject history = new Subject("History", "B2");
        history.setPartTeacher(partTimeTeacher2);
        history.addStudent(student2);
        history.addStudent(student4);
        history.addStudent(student6);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
        university.addPartTimeTeachers(partTimeTeacher1);
        university.addPartTimeTeachers(partTimeTeacher2);
        university.addFullTimeTeachers(fullTimeTeacher1);
        university.addFullTimeTeachers(fullTimeTeacher2);
        university.addSubjects(math);
        university.addSubjects(science);
        university.addSubjects(english);
        university.addSubjects(history);

    }

}
