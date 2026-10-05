public class Question1 {
    public static void main(String[] args) {
        Student s1 = new Student("C6240272", "Faiza Abdirahman", 21, "Networking & Security", 3.85);
        Student s2 = new Student("C12002", "Xatim Abdirahman", 21, "Computer Science", 1.80);
        Student s3 = new Student("C12003", "Aisha Mohamed", 23, "Information Technology", 3.20);
        Student s4 = new Student("C12004", "Omar Ahmed", -5, "Software Engineering", 4.5);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
        s4.displayStudentInfo();
    }
}