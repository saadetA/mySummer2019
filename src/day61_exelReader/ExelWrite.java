package day61_exelReader;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelWrite {
	public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\Cocuklar\\Desktop\\TestData.xlsx";//change it
        String sheetname = "Sheet1";
        
        FileInputStream file = new FileInputStream(filePath);//reads a file
        
        Workbook excelFile = WorkbookFactory.create(file);//specially designed for excel file
        
        Sheet sheet = excelFile.getSheet(sheetname); //gets the specific spread sheet from
        
        Cell cell = sheet.getRow(1).getCell(0);//Retrieves specific cell from the spreadsheet
        cell.setCellValue("Selma");// it reads that cell value as "Marufjon". BUT it DOES Not change the original value in excel file
        
        String celldata = cell.toString();
        System.out.println(celldata);
    }

}
