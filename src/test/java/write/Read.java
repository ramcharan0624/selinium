package write;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read {
FileInputStream FRead;
FileOutputStream Fwrite;
XSSFWorkbook wb;
XSSFSheet sh;
@Test
public void f() throws Exception {
FRead=new FileInputStream("C:\\Users\\ram.charan.bodduluru\\Downloads\\write.xlsx");
wb=new XSSFWorkbook(FRead);
sh=wb.getSheet("sheet1");
int rowcount=sh.getLastRowNum();
for(int i=0;i<=rowcount;i++)
{
String val=sh.getRow(i).getCell(0).getStringCellValue();
System.out.print(val+" ");
String val2=sh.getRow(i).getCell(1).getStringCellValue();
System.out.println(val2);
}
}
}
