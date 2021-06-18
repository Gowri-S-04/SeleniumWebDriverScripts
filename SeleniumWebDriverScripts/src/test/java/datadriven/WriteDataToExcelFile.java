package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcelFile {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("./TestData\\LoginWriteData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet s = wb.createSheet("Sheet1");

		for (int i = 0; i < 5; i++) {
			XSSFRow r = s.createRow(i);
			for (int j = 0; j < 2; j++) {
				r.createCell(j).setCellValue("Excel");
			}
		}
		wb.write(fos);
	}
}
