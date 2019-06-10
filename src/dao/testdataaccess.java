package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Grade;

public class testdataaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/news","root","");
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
	        System.out.println(list);

	}

}
