package com.vanessagl2.dojo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {

    List<String> retrieveFileContentAsList(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        List<String> inputLines = new ArrayList<>();
        String currentLine;

        while ((currentLine = bufferedReader.readLine()) != null) {
            inputLines.add(currentLine);
        }

        return inputLines;
    }
}
