package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.sql.ResultSupport;

import bean.Grade;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GradeDAO {
/*	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html; charset=utf-8");
        
        String exegrade="select sName,uGrade,mGrade,fGrade,pGrade,overGrade from grade where sNo=1;";
        ResultSet rs=DBUtil.exeSql(exegrade);
        Result r=(Result) ResultSupport.toResult(rs);
        while(rs.next()){
            int userid = rs.getInt(1);//获取第一个字段userid的值
            String username = rs.getString(2);//获取第二个字段username的值
            String userpassword = rs.getString(3);//获取第三个字段password的值
              
            //打印出所有的用户的信息
            System.out.println("用户ID："+userid+" 用户名："+username+" 用户的密码 "+userpassword+"<br />");
          }

       System.out.println(rs);
        response.getWriter().println(r);
        r.getAttributes();*/
    public static List<Grade> readFirstGrade(){
        List<Grade> list =new ArrayList<Grade>();
        Connection con=null;
        PreparedStatement psmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elearning_web","root","");
            String sql="select * from grade where sNo=1;";
            psmt=con.prepareStatement(sql);
            rs=psmt.executeQuery();
            
            while(rs.next())
            {
                int id=rs.getInt("sNo");
                String name=rs.getString("sName");
                int ug=rs.getInt("uGrade");
                int mg=rs.getInt("mGrade");
                int fg=rs.getInt("fGrade");
                int pg=rs.getInt("pGrade");
                int og=rs.getInt("overGrade");
                Grade tl=new Grade(id, name, ug, mg,fg,pg,og);
                list.add(tl);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            try {
                if(rs!=null)
                {
                    rs.close();
                }
                if(psmt!=null)
                {
                    psmt.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Grade> test=readFirstGrade();
		System.out.println(test.toArray()); 
	}
        
}

