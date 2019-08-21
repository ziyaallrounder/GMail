package generic_libraries;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Auto_Const
{
	public static String getCellValue(String sheet, int row, int cell)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(EXCEL_PATH);
			Workbook wb=WorkbookFactory.create(fis);
			Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
			v=c.toString();
		}
		
		catch(Exception e)
		{
			Reporter.log("path is invalid", true);
		}
		
		return v;
	}
	

}
