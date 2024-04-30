
package controller;

import models.StudentDetails;
import models.StudentMarksDetails;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
@WebServlet("/StudentExcellSheet")
public class StudentExcellSheet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StudentDetails> students = new ArrayList<>();
        students.add(new StudentDetails(1110, "aaa", "tyu", "inDelusionworld", "12/12/2002"));
        students.add(new StudentDetails(1112, "qffe", "rtgh", "milkywaygalaxy", "11/11/2007"));
        
        List<StudentMarksDetails> marks = new ArrayList<>();
        marks.add(new StudentMarksDetails(1110 , 93, 94, 95, 97 , 89));
        marks.add(new StudentMarksDetails(1112 , 93, 94, 95, 97 , 89));

 
        try (
		HSSFWorkbook workbook = new HSSFWorkbook()) {
        	
    		HSSFSheet sheet1 = workbook.createSheet("Students");
    		HSSFSheet sheet2 = workbook.createSheet("StudentMarks");
    		
			Row headerRow = sheet1.createRow(0);
			headerRow.createCell(0).setCellValue("ID");
			headerRow.createCell(1).setCellValue("First Name");
			headerRow.createCell(2).setCellValue("Last Name");
			headerRow.createCell(3).setCellValue("Address");
			headerRow.createCell(4).setCellValue("Date of Birth");
			
			
			HSSFRow rowhead1 = sheet2.createRow(0);
			rowhead1.createCell(0).setCellValue("ID");
			rowhead1.createCell(1).setCellValue("Mathematics");
			rowhead1.createCell(2).setCellValue("English");
			rowhead1.createCell(3).setCellValue("IT");
			rowhead1.createCell(4).setCellValue("Science");
			rowhead1.createCell(5).setCellValue("SSC");

			
 
			int rowNum = 1;
			for (StudentDetails student : students) {
			    Row row = sheet1.createRow(rowNum++);
			    row.createCell(0).setCellValue(student.getId());
			    row.createCell(1).setCellValue(student.getFirstName());
			    row.createCell(2).setCellValue(student.getLastName());
			    row.createCell(3).setCellValue(student.getAddress());
			    row.createCell(4).setCellValue(student.getDob());
			}
 
			
			

			int rowNum1 = 1;
			for (StudentMarksDetails mark : marks) {
			    Row row = sheet2.createRow(rowNum1++);
			    row.createCell(0).setCellValue(mark.getId());
			    row.createCell(1).setCellValue(mark.getMathMarks());
			    row.createCell(2).setCellValue(mark.getEnglishMarks());
			    row.createCell(3).setCellValue(mark.getItMarks());
			    row.createCell(4).setCellValue(mark.getScienceMarks());
			    row.createCell(4).setCellValue(mark.getSscMarks());
			}
			
			
			
			String desktopPath = "C:\\Users\\a2742040\\Desktop\\student.xls";
			try (FileOutputStream outputStream = new FileOutputStream(desktopPath)) {
			    workbook.write(outputStream);
			} catch (IOException e) {
			    e.printStackTrace();
			    response.getWriter().println("Error generating Excel file.");
			    return;
			}
		}
        response.getWriter().println("Students Excel file generated successfully!");
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}