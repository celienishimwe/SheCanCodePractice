package FullPractice;

public class StudentGrade {

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String Grade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80 && average <= 89) {
            return "B";
        } else if (average >= 70 && average <= 79) {
            return "C";
        } else if (average >= 60 && average <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {

        double assignmentScore = 85;
        double midtermScore = 78;
        double finalExamScore = 92;

        double average = calculateAverage(assignmentScore, midtermScore, finalExamScore);

        String grade = Grade(average);

        System.out.println("Student Scores:");
        System.out.println("Assignment: " + assignmentScore);
        System.out.println("Midterm: " + midtermScore);
        System.out.println("Final Exam: " + finalExamScore);
        System.out.println("Average Score: " + average);
        System.out.println("Final Grade: " + grade);
    }
}
