package CaseStudy;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewTest {
	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;
	public static DataFormatter formatter= new DataFormatter();
	public static Object[][] ReadData() throws Exception{
		FileInputStream fileInputStream= new FileInputStream("C:\\Testing\\Selenimum_ex_3.xlsx");
		workbook = new XSSFWorkbook(fileInputStream);
		worksheet = workbook.getSheet("sheet1");
		XSSFRow Row = worksheet.getRow(0);
		int RowNum = worksheet.getPhysicalNumberOfRows();
		int ColNum = Row.getLastCellNum();
		System.out.println("Rownum: "+ RowNum +"\n"+" ColNum: "+ ColNum);
		Object Data[][] = new Object[RowNum-1][ColNum];
		for(int i=0;i<RowNum-1;i++)
		{
			XSSFRow row = worksheet.getRow(i+1);
			for(int j=0;j<ColNum;j++)
			{
			XSSFCell cell = row.getCell(j);
			if(cell==null)
				Data[i][j] = "";
			else
			{
				String value= formatter.formatCellValue(cell);
				Data[i][j] = value;
			}
			}
		}
	return Data;	
	}
  
}
