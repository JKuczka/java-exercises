package org.launchcode.java.demos.java4python.school;

/**
 * Created by riz0
 */
public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    private double totalQualityScore;

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {
        return ((Student) o).getStudentId() == getStudentId();
    }

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        //Update the appropriate fields: numberOfCredits, gpa

        this.totalQualityScore = this.gpa * this.numberOfCredits;
        this.totalQualityScore += (courseCredits * grade);
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    public String getGradeLevel() {
        //Determine the grade level of the student based on numberOfCredits

        if (this.numberOfCredits <= 29 && this.numberOfCredits >= 0) {
            return "freshman";
        }
        else if (this.numberOfCredits <= 59) {
            return "sophomore";
        }
        else if (this.numberOfCredits <= 89) {
            return "junior";
        }
        else {
            return "Senior";
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getNumberOfCredits() { return numberOfCredits; }
    public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
