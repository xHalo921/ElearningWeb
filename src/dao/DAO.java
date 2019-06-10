package dao;

import bean.Grade;
import bean.Student;
import bean.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO implements IDAO{

    public Student findStu(String sNo, String sPassword) {
        String sql = "SELECT * FROM student WHERE sNo='"+sNo+"' and sPassword='"+sPassword+"'";
        ResultSet rs = DBUtil.exeSql(sql);
        Student s=null;
        try {
            if (rs.next()){
                s=new Student();
                //sNo	sPassword	sClass	sName	choice	sEmail	sPhone	notice
                //int	String	    int	   String	int	String	String	String
                s.setStudent(rs.getInt("sNo"),rs.getString("sPassword"),rs.getInt("sClass"),
                        rs.getString("sName"), rs.getInt("choice"),rs.getString("sEmail"),
                        rs.getString("sPhone"),rs.getString("notice"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    public boolean findStu(String sNo) {
        String sql = "SELECT * FROM student WHERE sNo='"+sNo+"'";
        ResultSet rs = DBUtil.exeSql(sql);
        try {
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Teacher findTea(String tNo, String tPassword) {
        String sql = "SELECT * FROM teacher WHERE tNo='"+tNo+"'and tPassword='"+tPassword+"'";
        ResultSet rs = DBUtil.exeSql(sql);
        Teacher t=null;
        try {
            if (rs.next()){
                t=new Teacher();
                //tNo	tPassword	tClass	tName	tEmail	tPhone
                t.setTeacher(rs.getInt("tNo"),rs.getString("tPassword"),rs.getInt("tClass"),
                        rs.getString("tName"),rs.getString("tEmail"),rs.getString("tPhone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }

    public boolean findTea(String tNo) {
        String sql = "SELECT * FROM teacher WHERE tNo='"+tNo+"'";
        ResultSet rs = DBUtil.exeSql(sql);
        try {
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Grade findGra(int sNo) {
        //sNo	sName	sClass	uGrade	mGrade	fGrade	pGrade	overGrade
        String sql = "SELECT * FROM grade WHERE sNo='"+sNo+"'";
        ResultSet rs = DBUtil.exeSql(sql);
        Grade grade=null;
        try {
            if (rs.next()){
                grade=new Grade();
                grade.setGrade(rs.getInt("sNo"),rs.getString("sName"),
                        rs.getInt("sClass"), rs.getInt("uGrade"),rs.getInt("mGrade"),
                        rs.getInt("fGrade"), rs.getInt("pGrade"),rs.getInt("overGrade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return grade;
    }

    public ArrayList<Student> findAllStu(int choice) {
        String sql = "SELECT * FROM student WHERE choice='"+choice+"'";
        ResultSet rs = DBUtil.exeSql(sql);
        Student s=null;
        ArrayList<Student> sList=new ArrayList<Student>();
        try {
            while (rs.next()){
                s=new Student();
                s.setStudent(rs.getInt("sNo"),rs.getString("sPassword"),rs.getInt("sClass"),
                        rs.getString("sName"), rs.getInt("choice"),rs.getString("sEmail"),
                        rs.getString("sPhone"),rs.getString("notice"));
                sList.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sList;
    }

    public ArrayList<Grade> findAllGra(ArrayList<Student> allStu) {
        for (Student s:allStu) {
            String sql = "SELECT * FROM grade WHERE sNo='"+s.getsNo()+"'";
            ResultSet rs = DBUtil.exeSql(sql);
            Grade grade=null;
            try {
                if (rs.next()){
                    grade=new Grade();
                    grade.setGrade(rs.getInt("sNo"),rs.getString("sName"),
                            rs.getInt("sClass"), rs.getInt("uGrade"),rs.getInt("mGrade"),
                            rs.getInt("fGrade"), rs.getInt("pGrade"),rs.getInt("overGrade"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public void addStu(Student stu) {
        String sql="Insert into student values('"+stu.getsNo()+"','"+stu.getsPassword()+"','"+stu.getsClass()+"','"+stu.getsName()
                +"','0','"+stu.getsEmail()+"','"+stu.getsPhone()+"','')";
        DBUtil.updateSql(sql);
    }

    public void addTea(Teacher tea) {
        String sql="Insert into teacher values('"+tea.gettNo()+"','"+tea.gettPassword()+"','"+tea.gettClass()
                +"','"+tea.gettName()+"','"+tea.gettEmail()+"','"+tea.gettPhone()+"')";
        DBUtil.updateSql(sql);
    }

    public void addGra(Grade grade) {
        String sql="Insert into grade values('"+grade.getsNo()+"','"+grade.getsName()+"','"+grade.getsClass()+"'," +
                "'"+grade.getuGrade()+"','"+grade.getmGrade()+"','"+grade.getfGrade()+"','"+grade.getpGrade()+"')";
        DBUtil.updateSql(sql);
    }

    public void updateStu(Student stu) {
        String sql="Update student set choice ='"+stu.getChoice()+"' where sNo='"+stu.getsNo()+"'";
        DBUtil.updateSql(sql);
    }

    public void addComment(String name,String title,String comments){
        String sql="insert Into discuss (name,title,comments) Values('"+name+"','"+title+"','"+comments+"')";
        DBUtil.updateSql(sql);
    }

    public List<Comments> findAllComment(){
        List<Comments> list=new ArrayList<Comments>();
        try {
            String sql = "SELECT * FROM discuss";
            ResultSet rs = DBUtil.exeSql(sql);
            while (rs.next()){
                Comments comment=new Comments();
                comment.setName(rs.getString("name"));
                comment.setTitle(rs.getString("title"));
                comment.setComments(rs.getString("comments"));
                list.add(comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
//    public void updateGra(Grade grade) {
//
//    }

}
