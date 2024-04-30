package models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/**
 * Servlet implementation class AddStudentMarksToExcel
 */
@WebServlet("/AddStudentMarksToExcel")
public class AddStudentMarksToExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentMarksToExcel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		   int id = Integer.parseInt(request.getParameter("id"));
		   int mathMarks = Integer.parseInt(request.getParameter("mathMarks"));
		   int englishMarks = Integer.parseInt(request.getParameter("englishMarks"));
		   int itMarks = Integer.parseInt(request.getParameter("itMarks"));
		   int scienceMarks = Integer.parseInt(request.getParameter("scienceMarks"));
		   int sscMarks = Integer.parseInt(request.getParameter("sscMarks"));

	 
	        String filePath = "C:\\Users\\a2742040\\Desktop\\student.xls";
	 
	      
	        try (FileInputStream fis = new FileInputStream(filePath);
	             HSSFWorkbook workbook = new HSSFWorkbook(fis)) {
	 
	            HSSFSheet sheet = workbook.getSheet("StudentMarks");
	            int lastRowNum = sheet.getLastRowNum();
	            Row newRow = sheet.createRow(lastRowNum + 1);
	            newRow.createCell(0).setCellValue(id);
	            newRow.createCell(1).setCellValue(mathMarks);
	            newRow.createCell(2).setCellValue(englishMarks);
	            newRow.createCell(3).setCellValue(itMarks);
	            newRow.createCell(4).setCellValue(scienceMarks);
	            newRow.createCell(5).setCellValue(sscMarks);

	 
	            FileOutputStream outputStream = new FileOutputStream(filePath);
	            workbook.write(outputStream);
	            outputStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	            response.getWriter().println("Error adding student details to Excel file.");
	            return;
	        }
	 
	        response.sendRedirect("home.jsp");
		
		   
	}

}
