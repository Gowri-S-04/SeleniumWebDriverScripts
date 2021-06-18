package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./TestData\\LoginData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Sheet1");

		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);

		int cellcount = s.getRow(0).getLastCellNum();
		System.out.println(cellcount);

		for (int i = 0; i < rowcount; i++) {
			XSSFRow r = s.getRow(i);
			for (int j = 0; j < cellcount; j++) {
				String cellvalue = r.getCell(j).toString();
				System.out.print(cellvalue + " ");
			}
			System.out.println();
		}
	}
}