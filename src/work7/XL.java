package work7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path ="C:\\ABC\\JAVA\\hello.xlsx";
		File f=new File (path);
		FileOutputStream fo=new  FileOutputStream(f);	
		
		
		
XSSFWorkbook wb= new XSSFWorkbook();
XSSFSheet ws1=wb.createSheet("random number");


ws1.createRow(0).createCell(0).setCellValue("no");
ws1.getRow(0).createCell(1).setCellValue("Digit");


for(int i=1;i <=500;i++) {
	ws1.createRow(i).createCell(0).setCellValue(i);

	ws1.getRow(i).createCell(1).setCellValue(getrandomno(100,499));
	
}


wb.write(fo);
wb.close();


	}
public static int getrandomno(int min,int max) throws IOException {
	if (min>=max) {
		throw new IOException("wrong");
	}
		Random r =new Random();
		return r.nextInt(max-min)+1+min;
	}
}




	


