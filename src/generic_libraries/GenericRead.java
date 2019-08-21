package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericRead 
{
		
	
		public static String getCellval(String sheet, int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
		{
			FileInputStream fis=new FileInputStream("./Excel/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheet);
			Row r = sh.getRow(row);
			Cell c = r.getCell(cell);
			String v1=c.toString();
			System.out.println(v1);
			
			return v1;
			
		}
	

}
