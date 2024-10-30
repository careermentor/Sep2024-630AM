package demoPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandling 
{
	public static void readexcel() throws Exception
	{
		File f = new File("./TestData/test.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("data");
		
		int nr = sh1.getPhysicalNumberOfRows(); //4
		
		for(int i=0;i<nr;i++) //0<4, 1<4, 2<4, 3<4
		{
			XSSFRow row = sh1.getRow(i); //i=0, i=1
			
			int nc = row.getPhysicalNumberOfCells();//2
			
			for(int j=0;j<nc;j++)  //j=0, j=1
			{
				XSSFCell col = row.getCell(j);
				System.out.print(col.getStringCellValue() + "   ");
			}
			
			System.out.println();
		}
		
		
		
		/*
		
		
		//Row number 1
		XSSFRow row1 = sh1.getRow(0);
		XSSFCell col1 = row1.getCell(0);
		System.out.println(col1.getStringCellValue());
		
		//Row number 2
				XSSFRow row2 = sh1.getRow(1);
				XSSFCell col21 = row2.getCell(0);
				System.out.print(col21.getStringCellValue() + "   ");
				
				XSSFCell col22 = row2.getCell(1);
				System.out.println(col22.getStringCellValue());
		
		//Row number 3
				XSSFRow row3 = sh1.getRow(2);
				XSSFCell col31 = row3.getCell(0);
				System.out.print(col31.getStringCellValue() + "   ");
				
				XSSFCell col32 = row3.getCell(1);
				System.out.print(col32.getStringCellValue() + "  ");
				
				XSSFCell col33 = row3.getCell(2);
				System.out.println(col33.getStringCellValue());
		*/		
	}
	

	public static void main(String[] args) throws Exception 
	{
		readexcel();

	}

}
