package org.systech.compliance.utils.DataProviders;


import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
public class ReadXlsxData {
    @DataProvider(name = "login")
    public Object[][] getData(Method m) throws IOException {
//        String excelSheetName = "login";
        String separator = File.separator;
        String excelSheetName = m.getName();
        String filePath = "src"+separator+"test"+separator+"resources"+separator+"TestData"+separator+"tData.xlsx";
        System.out.println(excelSheetName);
        File f = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(f);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheetName = workbook.getSheet(excelSheetName);
        System.out.println(sheetName);

        int totalRows = sheetName.getLastRowNum();
//        System.out.println(totalRows);
        Row rowCells = sheetName.getRow(0);
        int totalCols = rowCells.getLastCellNum();
//        System.out.println(totalCols);


        DataFormatter format = new DataFormatter();
        String testData[][] = new String[totalRows][totalCols];
        for (int i = 1; i<=totalRows; i++){
            for (int j=0; j<totalCols; j++){
                testData[i-1][j] = format.formatCellValue(sheetName.getRow(i).getCell(j));
//                System.out.println(testData[i-1][j]);
            }
        }

        return testData;
    }

}