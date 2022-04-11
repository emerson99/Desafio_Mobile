package com.templateJavaAppium.bases;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDriveUtil {
    private static XSSFSheet ExcelWSheet;

    private static XSSFWorkbook ExcelWBook;

    private static XSSFCell Cell;

    private static XSSFRow Row;
    private Workbook workbook;
    public  String sheetName;
    public Sheet sheet;

    public  DataDriveUtil(String sourceUrl, boolean hasHeaders, Workbook workbook) throws IOException {
        // super(sourceUrl, hasHeaders);
        this.workbook = workbook;
        // Add these:
        this.sheet = workbook.getSheetAt(workbook.getActiveSheetIndex());
        this.sheetName = sheet.getSheetName();


        ExcelWSheet = ExcelWBook.getSheet(sheetName);
    }

    public static void setExcelFile(String Path,String SheetName) throws Exception {

        try {

            // Open the Excel file

            FileInputStream ExcelFile = new FileInputStream(Path);

            // Access the required test data sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

        } catch (Exception e){

            throw (e);

        }

    }
    public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

        String[][] tabArray = null;

        try {

            FileInputStream ExcelFile = new FileInputStream(FilePath);

            // Access the required test data sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

            int startRow = 1;

            int startCol = 1;

            int ci, cj;

            int totalRows = ExcelWSheet.getLastRowNum();

            // you can write a function as well to get Column count

            int totalCols = 2;

            tabArray = new String[totalRows][totalCols];

            ci = 0;

            for (int i = startRow; i <= totalRows; i++, ci++) {

                cj = 0;

                for (int j = startCol; j <= totalCols; j++, cj++) {

                    tabArray[ci][cj] = getCellData(i, j);

                    System.out.println(tabArray[ci][cj]);

                }

            }

        }

        catch (FileNotFoundException e) {

            System.out.println("Could not read the Excel sheet");

            e.printStackTrace();

        }

        catch (IOException e) {

            System.out.println("Could not read the Excel sheet");

            e.printStackTrace();

        }

        return (tabArray);

    }

    public static String getCellData(int RowNum, int ColNum) throws Exception {

        try{

            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            String dataType = String.valueOf(Cell.getCellType());

            if  (dataType == "3") {

                return "";

            }else{

                String CellData = Cell.getStringCellValue();

                return CellData;
            }

        }catch (Exception e){

            System.out.println(e.getMessage());

            throw (e);

        }

    }

    public static String getCellData2(int RowNum, int ColNum) throws Exception{

        try{

            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            String CellData = Cell.getStringCellValue();

            return CellData;

        }catch (Exception e){

            return"";

        }

    }
    public static String getTestCaseName(String sTestCase)throws Exception{

        String value = sTestCase;

        try{

            int posi = value.indexOf("@");

            value = value.substring(0, posi);

            posi = value.lastIndexOf(".");

            value = value.substring(posi + 1);

            return value;

        }catch (Exception e){

            throw (e);

        }

    }

    public static int getRowContains(String sTestCaseName, int colNum) throws Exception{

        int i;

        try {

            int rowCount = DataDriveUtil.getRowUsed();

            for ( i=0 ; i<rowCount; i++){

                if  (DataDriveUtil.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){

                    break;

                }

            }

            return i;

        }catch (Exception e){

            throw(e);

        }

    }

    public static int getRowUsed() throws Exception {

        try{

            int RowCount = ExcelWSheet.getLastRowNum();

            return RowCount;

        }catch (Exception e){

            System.out.println(e.getMessage());

            throw (e);

        }

    }
    public static Object[][] getTableArray(String FilePath, String SheetName, int iTestCaseRow)    throws Exception

    {

        String[][] tabArray = null;

        try{

            FileInputStream ExcelFile = new FileInputStream(FilePath);

            // Access the required test data sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

            int startCol = 1;

            int ci=0,cj=0;

            int totalRows = 1;

            int totalCols = ExcelWSheet.getLastRowNum();

            tabArray=new String[totalRows][totalCols];

            for (int j=startCol;j<=totalCols;j++, cj++)

            {

                tabArray[ci][cj]=getCellData(iTestCaseRow,j);

                System.out.println(tabArray[ci][cj]);

            }

        }

        catch (FileNotFoundException e)

        {

            System.out.println("Could not read the Excel sheet");

            e.printStackTrace();

        }

        catch (IOException e)

        {

            System.out.println("Could not read the Excel sheet");

            e.printStackTrace();

        }

        return(tabArray);

    }
}
