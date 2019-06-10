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

import bean.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
	    public List<Course> readFirstCourse(){
	        List<Course> list =new ArrayList<Course>();
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
	            String sql="select * from Course where cNo=1;";
	            psmt=con.prepareStatement(sql);
	            rs=psmt.executeQuery();
	            
	            while(rs.next())
	            {
	                int id=rs.getInt("cNo");
	                String name=rs.getString("cName");
	                int hour=rs.getInt("cHour");
	                int credit=rs.getInt("cCredit");
	                String student=rs.getString("cStudent");
	                Course tl=new Course(id, name,hour, credit,student);
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

}
