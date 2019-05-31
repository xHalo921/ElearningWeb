package dao;

import bean.Grade;
import bean.Student;
import bean.Teacher;

import java.util.ArrayList;

public class DAO implements IDAO{
    public Student findStu(int sNo, String sPassword) {
        return null;
    }

    public Teacher findTea(int tNo, String tPassword) {
        return null;
    }

    public Grade findGra(int sNo) {
        return null;
    }

    public ArrayList<Student> findAllStu(int choice) {
        return null;
    }

    public ArrayList<Grade> findAllGra(ArrayList<Student> allStu) {
        return null;
    }

    public void addStu(Student stu) {

    }

    public void addTea(Teacher stu) {

    }

    public void addGra(Grade grade) {

    }

    public void updateStu(Student stu) {

    }

    public void updateGra(Grade grade) {

    }

}
