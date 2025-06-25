package utilityPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;

public class Excelsheetdata
{
	@DataProvider(name = "logindetails")
	public Object[][] validtestdata() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("E:\\excelsheet\\jyoti1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String un1=NumberToTextConverter.toText( wb.getSheet("Project1").getRow(1).getCell(0).getNumericCellValue());
		String pwd1=NumberToTextConverter.toText( wb.getSheet("Project1").getRow(1).getCell(1).getNumericCellValue());
		Object[][] d1 = new Object[1][2];
		d1[1][0] = un1;
		d1[1][1] = pwd1;
		return d1;
	}
	@DataProvider(name = "logindetails1")
	public Object[][] validtestdataforrating() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("E:\\excelsheet\\jyoti1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String un2=wb.getSheet("Project1").getRow(2).getCell(0).getStringCellValue();
		String pwd2=NumberToTextConverter.toText( wb.getSheet("Project1").getRow(2).getCell(1).getNumericCellValue());
		Object[][] d1 = new Object[0][1];
		d1[1][0] = un2;
		d1[1][1] = pwd2;
		return d1;
	}
	@DataProvider(name = "invalidlogindetails")
	public Object[][] invalidtestdata() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("E:\\excelsheet\\jyoti1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String un3=NumberToTextConverter.toText( wb.getSheet("Project1").getRow(3).getCell(0).getNumericCellValue());
		String pwd3=NumberToTextConverter.toText( wb.getSheet("Project1").getRow(3).getCell(1).getNumericCellValue());
		Object[][] d1 = new Object[4][2];	
		d1[2][0] = un3;
		d1[2][1] = pwd3;
		return d1;
	}
	@DataProvider(name = "urldetails")
	public Object[][] urltestdata() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("E:\\excelsheet\\jyoti1.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String url=wb.getSheet("Project1").getRow(4).getCell(1).getStringCellValue();
		Object[][] d1 = new Object[4][1];
		d1[3][0] = url;		
		return d1;
	}
}
