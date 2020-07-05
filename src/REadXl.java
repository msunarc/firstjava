
 

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * A dirty simple program that reads an Excel file.
 * @author www.codejava.net
 *
 */
public class REadXl {
     
    public static void main(String[] args) throws IOException {
  
  
    	FileInputStream fi=new FileInputStream("C:\\ABC\\JAVA\\hello.xlsx"); 
    	Workbook wb=WorkbookFactory.create(fi);

    	org.apache.poi.ss.usermodel.Sheet sheet= wb.getSheetAt(0);
    	System.out.println (sheet.getPhysicalNumberOfRows());
    	System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());

    		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
    		System.out.println(sheet.getRow(i).getCell(0));
    		System.out.println(sheet.getRow(i).getCell(1));
    		}
    		fi.close();
}
}