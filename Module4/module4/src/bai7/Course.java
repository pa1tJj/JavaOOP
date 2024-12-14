/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.Set;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Course {
    private String courseNbr;
    private String courseTitle;
    private int credits;
    private Set<Section> sections;

    public Course() {
    }

    public String getCourseNbr() {
        return courseNbr;
    }

    public void setCourseNbr(String courseNbr) {
        this.courseNbr = courseNbr;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }
    
}

