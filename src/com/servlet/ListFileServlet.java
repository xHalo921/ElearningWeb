package com.servlet;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListFileServlet
 */
public class ListFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    // ��ȡ�ϴ��ļ���Ŀ¼
        String uploadFilePath = this.getServletContext().getRealPath("/WEB-INF/upload");
        // �洢Ҫ���ص��ļ���
        Map<String, String> fileNameMap = new HashMap<String, String>();
        // �ݹ����filepathĿ¼�µ������ļ���Ŀ¼�����ļ����ļ����洢��map������
        listFile(new File(uploadFilePath), fileNameMap);// File�ȿ��Դ���һ���ļ�Ҳ���Դ���һ��Ŀ¼
        // ��Map���Ϸ��͵�listfile.jspҳ�������ʾ
        request.setAttribute("fileNameMap", fileNameMap);
        request.getRequestDispatcher("/listFile.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	  /**
     * �ݹ����ָ��Ŀ¼�µ������ļ�
     * @param file
     * @param map
     */
    public void listFile(File file, Map<String, String> map) {
        
        if(file == null) return;
        
        // ���file����Ĳ���һ���ļ�������һ��Ŀ¼
        if (!file.isFile()) {
            // �г���Ŀ¼�µ������ļ���Ŀ¼
            File files[] = file.listFiles();
            if(files == null) return;
            // ����files[]����
            for (File f : files) {
                // �ݹ�
                listFile(f, map);
            }
        } else {
            String realName = file.getName().substring(file.getName().indexOf("_") + 1);
            // file.getName()�õ������ļ���ԭʼ���ƣ����������Ψһ�ģ���˿�����Ϊkey��realName�Ǵ����������ƣ��п��ܻ��ظ�
            map.put(file.getName(), realName);
        }
    }


}
