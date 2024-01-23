package org.systech.compliance.utils.DataProviders;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.systech.compliance.base.BaseClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcel extends BaseClass
{


    //    @DataProvider(name="bvtdata")
    @DataProvider(name="login")
    public Iterator<Object[]> getData(Method m) {
        List<Object[]> data = new ArrayList<>();
        String separator = File.separator;
        String excelSheetName = m.getName();
        String filePath = "src"+separator+"test"+separator+"resources"+separator+"TestData"+separator+"tData.xlsx";



        try {
            FileInputStream file=new FileInputStream(filePath);
//            FileInputStream file = new FileInputStream(new File("src/main/resources/testdata.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            DataFormatter format=new DataFormatter();
//            String testData[][]=new String[0][0];
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                List<String> rowData = new ArrayList<>();

                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    String cellData = "";
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            cellData = cell.getNumericCellValue() + " ";
//                            rowData.add(cellData);


                            break;
                        case STRING:
                            cellData = cell.getStringCellValue() + " ";
//                            rowData.add(cellData);
                            break;
                        default:
                            cellData = "";
//                            rowData.add(cellData);
                    }
                    rowData.add(cellData);



                }
//                testData.addRow(rowData.toArray());
                data.add(rowData.toArray());

            }

            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data.iterator();
    }

}