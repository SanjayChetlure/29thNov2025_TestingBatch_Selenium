package S2_Excel;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex2_GetColSize_InARow
{
    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream("D:\\29th Nov 2025\\Selenium\\29thNov25.xlsx");

        int colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
        System.out.println(colSize);
    }
}
