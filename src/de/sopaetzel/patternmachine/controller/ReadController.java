package de.sopaetzel.patternmachine.controller;


import de.sopaetzel.patternmachine.model.LineModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ReadController {

    String regExp = "[ \\t\\n\\x0B\\f\\r]";
    LineModel lineModel;


    String ipPattern = "[\\d]";

    Pattern pattern = Pattern.compile(ipPattern);


    public void readLineByLine(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line = bufferedReader.readLine();
        applyPattern(line);


    }

    public void applyPattern(String line) {
    }


}
