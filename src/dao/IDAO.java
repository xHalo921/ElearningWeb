package dao;

import bean.Grade;
import bean.Student;
import bean.Teacher;

import java.util.ArrayList;

public interface IDAO {
    Student findStu(int sNo, String sPassword);
    Teacher findTea(int tNo, String tPassword);
    Grade findGra(int sNo);
    ArrayList<Student> findAllStu(int choice);
    ArrayList<Grade> findAllGra(ArrayList<Student> allStu);

    void addStu(Student stu);
    void addTea(Teacher stu);
    void addGra(Grade grade);

    void updateStu(Student stu);
    void updateGra(Grade grade);
}
