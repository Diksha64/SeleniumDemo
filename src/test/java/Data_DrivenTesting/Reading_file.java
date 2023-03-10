package Data_DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_file {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\DataFiles\\Data1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int tr=sheet.getLastRowNum();
		int tc = sheet.getRow(1).getLastCellNum();
		
		System.out.println(tr);
		System.out.println(tc);
		
		for(int r=0;r<=tr;r++) {
			XSSFRow cr = sheet.getRow(r);
			for(int c =0;c<tc;c++) {
				String v=cr.getCell(c).toString();
				System.out.print(v+" ");
			}
			System.out.println();
		}
		wb.close();
		file.close();
	}

}
