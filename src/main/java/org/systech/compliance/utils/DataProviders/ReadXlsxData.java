package org.systech.compliance.utils.DataProviders;


import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
public class ReadXlsxData {
    @DataProvider(name = "login")
    public Object[][] getData(Method m) {
        String excelSheetName = "Sheet1"; // Update with your actual sheet name
        String filePath = "src/main/resources/TestData/logindata.xlsx";

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fileInputStream)) {

            Sheet sheetName = workbook.getSheet(excelSheetName);

            if (sheetName == null) {
                throw new RuntimeException("Sheet with name '" + excelSheetName + "' not found.");
            }

            int totalRows = sheetName.getLastRowNum() + 1;
            Row headerRow = sheetName.getRow(0);
            int totalCols = headerRow.getLastCellNum();

            DataFormatter format = new DataFormatter();
            String testData[][] = new String[totalRows - 1][totalCols];

            for (int i = 1; i < totalRows; i++) {
                Row currentRow = sheetName.getRow(i);
                for (int j = 0; j < totalCols; j++) {
                    testData[i - 1][j] = format.formatCellValue(currentRow.getCell(j));
                }
            }

            return testData;

        } catch (IOException e) {
            throw new RuntimeException("Error reading Excel file: " + e.getMessage(), e);
        }
    }


}