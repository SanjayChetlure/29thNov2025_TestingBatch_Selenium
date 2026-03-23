package S2_Excel;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_GetBooleanData
{
    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("D:\\29th Nov 2025\\Selenium\\29thNov25.xlsx");


        boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
        System.out.println(data);

    }
}
