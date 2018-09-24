package a;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {

	public static void main(String[] args) throws Exception {
		Workbook w=WorkbookFactory.create(new FileInputStream("./Data/Book1.xlsx"));
		String f=w.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(f);
	}

}
