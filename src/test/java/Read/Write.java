package Read;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.testng.annotations.Test;

public class Write {
FileInputStream FRead;
FileOutputStream FWrite;
XSSFWorkbook wb;
XSSFSheet sh;
@Test
public void f() throws Exception{
FRead=new FileInputStream("C:\\Users\\ram.charan.bodduluru\\Downloads\\charan.xlsx");
wb=new  XSSFWorkbook(FRead);
sh=wb.getSheetAt(0);
Row row=sh.createRow(0);
Cell cell=row.createCell(0);
cell.setCellValue("ramcharan");
FWrite=new FileOutputStream("C:\\Users\\ram.charan.bodduluru\\Downloads\\charan.xlsx");
wb.write(FWrite);
}
}
