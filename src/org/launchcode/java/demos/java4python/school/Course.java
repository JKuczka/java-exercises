package org.launchcode.java.demos.java4python.school;

import java.util.ArrayList;

/**
 * Created by riz0
 */
public class Course {

    private String name;
    private String courseNumber;
    private ArrayList<Student> students;

    public String toString() {
        return name + " (Course Number: " + courseNumber + ")";
    }

    public boolean equals(Object o) {
        return ((Course) o).getCourseNumber() == getCourseNumber();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCourseNumber() { return courseNumber; }
    public void setCourseNumber(String courseNumber) { this.courseNumber = courseNumber; }

    public ArrayList<Student> getStudents() { return students; }
    public void setStudents(ArrayList<Student> students) { this.students = students; }
}