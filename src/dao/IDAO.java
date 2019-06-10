package dao;

import bean.Grade;
import bean.Student;
import bean.Teacher;

import java.util.ArrayList;
import java.util.List;

public interface IDAO {
    Student findStu(String sNo, String sPassword);
    boolean findStu(String sNo);
    Teacher findTea(String tNo, String tPassword);
    boolean findTea(String tNo);
    Grade findGra(int sNo);
    ArrayList<Student> findAllStu(int choice);
    ArrayList<Grade> findAllGra(ArrayList<Student> allStu);

    void addStu(Student stu);
    void addTea(Teacher stu);
    void addGra(Grade grade);

    void updateStu(Student stu);

    void addComment(String name,String title,String comments);
    public List<Comments> findAllComment();
    //void updateGra(Grade grade);
}
