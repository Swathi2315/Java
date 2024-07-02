public class University {

    static  String studentName = "Kruthika G K";
   static int studentID= 12345;
    static String courseName= "JAVA";
   static double grade= 3.8;
    static int year = 2022;

     
   

    public static void getStudentName() {
        if (studentName != null) {
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("Student name not available.");
        }
    }

    public static void getStudentID() {
        if (studentID > 0) {
            System.out.println("Student ID: " + studentID);
        } else {
            System.out.println("Invalid Student ID.");
        }
    }

    public static void getCourseName() {
        if (courseName != null) {
            System.out.println("Course Name: " + courseName);
        } else {
            System.out.println("Course name not available.");
        }
    }

    public static  void getGrade() {
        if (grade >= 0.0 && grade <= 4.0) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid grade.");
        }
    }

    public static void getYear() {
        if (year > 0) {
            System.out.println("Year: " + year);
        } else {
            System.out.println("Invalid year.");
        }
    }

}