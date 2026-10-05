public class Student {
    private String studentID;
    private String name;
    private int age;
    private String department;
    private double gpa;

    public static String universityName = "Jamhuriya University";

    //Constructor
    public Student(String studentID, String name, int age, String department, double gpa) {
        this.studentID = studentID;
        this.name = name;
        setAge(age);
        this.department = department;
        setGpa(gpa);
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age is invalid!");
            this.age = 18;
        }
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA is invalid!");
            this.gpa = 0.0;
        }
    }

    public boolean hasPassed() {
        return this.gpa >= 2.0;
    }

    public void displayStudentInfo() {
        System.out.println("University: " + universityName);
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("Status: " + (hasPassed() ? "PASSED " : "FAILED "));
    }
}