//package sheets;
//
//import java.io.FileInputStream;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//
//import models.StudentDetails;
//import models.StudentMarksDetails;
//
///**
// * Servlet implementation class ViewStudentMarksDetails
// */
//@WebServlet("/ViewStudentMarksDetails")
//public class ViewStudentMarksDetails extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ViewStudentMarksDetails() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
////		 List<StudentMarksDetails> studentMarksList = new ArrayList<>();
////		 
////	        String filePath = "C:\\Users\\a2742040\\Desktop\\student.xls";
////	        try (FileInputStream fis = new FileInputStream(filePath);
////	             Workbook workbook = new HSSFWorkbook(fis)) {
////	 
////	            Sheet sheet = workbook.getSheet("StudentMarks");
////	            if (sheet == null) {
////	                response.getWriter().println("Sheet not found.");
////	                return;
////	            }
////	 
////	            Iterator<Row> iterator = sheet.iterator();
////	 
////	            if (iterator.hasNext()) {
////	                iterator.next();
////	            }
////	 
////	            while (iterator.hasNext()) {
////	                Row currentRow = iterator.next();
////	                int id = (int) currentRow.getCell(0).getNumericCellValue();
////	                int mathMarks = (int) currentRow.getCell(1).getNumericCellValue();
////	                int englishMarks = (int) currentRow.getCell(2).getNumericCellValue();
////	                int itMarks = (int) currentRow.getCell(3).getNumericCellValue();
////	                int scienceMarks = (int) currentRow.getCell(4).getNumericCellValue();
////	                int sscMarks = (int) currentRow.getCell(5).getNumericCellValue();
////	                studentMarksList.add(new StudentMarksDetails(id, mathMarks, englishMarks, itMarks, scienceMarks, sscMarks));
////	            }
////	        } catch (IOException e) {
////	            e.printStackTrace();
////	            response.getWriter().println("Error reading Excel file.");
////	            return;
////	        }
////	 
////	        request.setAttribute("studentMarksList", studentMarksList);
////	 
////	        request.getRequestDispatcher("/viewStudentMarks.jsp").forward(request, response);
//		
//		
//		
//		List<StudentMarksDetails> studentMarksList = new ArrayList<>();
//		 
//        String filePath = "C:\\Users\\a2742040\\Desktop\\student.xls";
//		try (FileInputStream fis = new FileInputStream(filePath);
//             Workbook workbook = new HSSFWorkbook(fis)) {
//        	
//            HSSFSheet sheet = (HSSFSheet) workbook.getSheet("Students");
//
// 
//            org.apache.poi.ss.usermodel.Sheet sheet1 = workbook.getSheetAt(0);
//            Iterator<Row> iterator = sheet1.iterator();
//            
//            if (iterator.hasNext()) {
//                iterator.next();
//            }
//            while (iterator.hasNext()) {
//            	Row currentRow = iterator.next();
//                int id = (int) currentRow.getCell(0).getNumericCellValue();
//                int mathMarks = (int) currentRow.getCell(1).getNumericCellValue();
//                int englishMarks = (int) currentRow.getCell(2).getNumericCellValue();
//                int itMarks = (int) currentRow.getCell(3).getNumericCellValue();
//                int scienceMarks = (int) currentRow.getCell(4).getNumericCellValue();
//                int sscMarks = (int) currentRow.getCell(5).getNumericCellValue();
//                studentMarksList.add(new StudentMarksDetails(id, mathMarks, englishMarks, itMarks, scienceMarks, sscMarks));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
// 
//        request.setAttribute("studentMarksList", studentMarksList);
// 
//        request.getRequestDispatcher("/viewStudentMarks.jsp").forward(request, response);
//	}
//		
////	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}



package sheets;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import models.StudentMarksDetails;
 
@WebServlet("/ViewStudentMarksDetails")
public class ViewStudentMarksDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<StudentMarksDetails> studentMarksList = new ArrayList<>();
        String filePath = "C:\\Users\\a2742040\\Desktop\\student.xls";
        try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new HSSFWorkbook(fis)) {
            HSSFSheet sheet = (HSSFSheet) workbook.getSheet("StudentMarks");
            Iterator<Row> iterator = sheet.iterator();
            if (iterator.hasNext()) {
                iterator.next();
            }
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                
                
                int id = (int) currentRow.getCell(0).getNumericCellValue();
                
              int mathMarks = 0, englishMarks = 0, itMarks = 0, scienceMarks = 0, sscMarks = 0;

              
                if (currentRow.getCell(1) != null) {
                    mathMarks = (int) currentRow.getCell(1).getNumericCellValue();
                }
                if (currentRow.getCell(2) != null) {
                    englishMarks = (int) currentRow.getCell(2).getNumericCellValue();
                }
                if (currentRow.getCell(3) != null) {
                    itMarks = (int) currentRow.getCell(3).getNumericCellValue();
                }
                if (currentRow.getCell(4) != null) {
                    scienceMarks = (int) currentRow.getCell(4).getNumericCellValue();
                }
                if (currentRow.getCell(5) != null) {
                    sscMarks = (int) currentRow.getCell(5).getNumericCellValue();
                }
                studentMarksList.add(new StudentMarksDetails(id, mathMarks, englishMarks, itMarks, scienceMarks, sscMarks));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        request.setAttribute("studentMarksList", studentMarksList);
        request.getRequestDispatcher("/viewStudentMarks.jsp").forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
