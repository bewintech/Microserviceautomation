package org.systech.compliance.utils.DataProviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {
    public FileInputStream reads(String url) throws FileNotFoundException {
        FileInputStream fr = new FileInputStream(new File(url));
        return fr;
    }
}