package S2_Excel;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex4_getSpecificDataByVerifying_TypeOfCell
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream file=new FileInputStream("D:\\29th Nov 2025\\Selenium\\29thNov25.xlsx");

        Cell cl = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2);
        CellType type = cl.getCellType();

        if(type==CellType.STRING)
        {
            String data = cl.getStringCellValue();
            System.out.println(data);
        }
        else if(type==CellType.NUMERIC)
        {
            double data=cl.getNumericCellValue();
            System.out.println(data);
        }
        else if(type==CellType.BOOLEAN)
        {
            boolean data=cl.getBooleanCellValue();
            System.out.println(data);
        }

    }
}
