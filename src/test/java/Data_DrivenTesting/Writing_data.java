package Data_DrivenTesting;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_data {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream(System.getProperty("user.dir")+"\\DataFiles\\Data3.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet s = wb.createSheet();
		
//		XSSFRow r1 = s.createRow(0);
//		r1.createCell(0).setCellValue("Welcome");
//		r1.createCell(1).setCellValue("to");
//		r1.createCell(2).setCellValue("Writing");
//		r1.createCell(3).setCellValue("File");
		
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<=3;r++) {
			XSSFRow cr = s.createRow(r);
			for(int c=0;c<2;c++) {
				System.out.println("Enter a value: ");
				String v = sc.next();
				cr.createCell(c).setCellValue(v);
			}
		}
				
		wb.write(f);
		wb.close();
		f.close();
		
		System.out.println("Writing is done...");

	}

}
