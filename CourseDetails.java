/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructorsassignment;

/**
 *
 * @author TMacRae2026
 */

/*
Write a class called Course that represents a course 
offered to students. 
It should contain instance data that 
represents the course title (e.g. Computer Science), 
course code (e,g, AP CS A), pointsTotal, and course Instructor’s name. 
Define one Course constructor to accept and initialize all instance data. 
Define a second constructor which accepts course name only.
Include Accessor (getter) and Mutator (setter) methods for all instance data. 
Include a toString method that returns a multi-line description of the course. 

Create a driver class called CourseDetails whose
main method instantiates and updates several Course objects (at least 3).
At least one course should be created using the full object constructor, and one 
that uses the name only creator (but has the rest of it's values set by the setter and 
retrieved by getter methods).
The main method should then print out each course from the toString.
*/
public class CourseDetails { // driver class (main class)

    public static void main(String[] args) {
        //full constructor
        Course course1 = new Course("AP English Language and Composition", "AP Lang & Comp", "Mr. Werstler", 500);
        
        //small consturctors
        Course course2 = new Course("AP Computer Science A");
        course2.setCourseCode("AP CS A");
        course2.setInstructor("Mr. Nelson");
        course2.setPointsTotal(1000);
        
        Course course3 = new Course("AP Biology");
        course3.setCourseCode("AP Bio");
        course3.setInstructor("Ms. Lopatka");
        course3.setPointsTotal(800);
        
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
        
    }
}

class Course {
    
    private String courseName;
    private String courseCode;
    private String instructor;
    private int pointsTotal;

    public Course(String courseName, String courseCode, String instructor, int pointsTotal) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.pointsTotal = pointsTotal;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    @Override
    public String toString() {
        return courseName + ":\n  - course code: " + courseCode + "\n  - instructor: " + instructor + "\n  - total points: " + pointsTotal;
    }
    
    
    //getters and setters (You can autogenerate them in netbeans)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
    
    
}
