package utilityPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class TestData {
	public static String stringdata(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
        FileInputStream f1 = new FileInputStream("E:\\excelsheet\\jyoti1.xlsx");
        Workbook wb = WorkbookFactory.create(f1);
        String data=wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	
	}
	public static String Numericdata(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, IOException {
        FileInputStream f1 = new FileInputStream("E:\\excelsheet\\jyoti1.xlsx");
        Workbook wb = WorkbookFactory.create(f1);
        String data=NumberToTextConverter.toText( wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getNumericCellValue());
		return data;
	
	}
}
