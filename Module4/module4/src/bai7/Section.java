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
public class Section {
    private String semester;
    private String sectionNbr;
    private String room;
    private Faculty facultyMember;
    private Set<Enrolment> listEnrolls;

    public Section() {
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSectionNbr() {
        return sectionNbr;
    }

    public void setSectionNbr(String sectionNbr) {
        this.sectionNbr = sectionNbr;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Faculty getFacultyMember() {
        return facultyMember;
    }

    public void setFacultyMember(Faculty facultyMember) {
        this.facultyMember = facultyMember;
    }

    public Set<Enrolment> getListEnrolls() {
        return listEnrolls;
    }

    public void setListEnrolls(Set<Enrolment> listEnrolls) {
        this.listEnrolls = listEnrolls;
    }
    
    
}

