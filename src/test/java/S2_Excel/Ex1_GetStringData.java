package S2_Excel;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_GetStringData
{
    public static void main(String[] args) throws IOException {
        
        FileInputStream file=new FileInputStream("D:\\29th Nov 2025\\Selenium\\29thNov25.xlsx");

//        Workbook book = WorkbookFactory.create(file);      //className.methodName()

//        Sheet sh = book.getSheet("Sheet1");
//        Row rw = sh.getRow(1);
//        Cell cl = rw.getCell(1);
//        String data = cl.getStringCellValue();
//        System.out.println(data);

        String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(data);
    }
}
