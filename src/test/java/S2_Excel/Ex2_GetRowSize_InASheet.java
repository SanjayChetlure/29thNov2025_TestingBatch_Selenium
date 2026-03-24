package S2_Excel;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_GetRowSize_InASheet
{
    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("D:\\29th Nov 2025\\Selenium\\29thNov25.xlsx");

        int rowSize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum() + 1;
        System.out.println(rowSize);
    }
}
