package de.sopaetzel.patternmachine.controller;


import de.sopaetzel.patternmachine.model.LineModel;
import de.sopaetzel.patternmachine.model.Lines;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ReadController {

    private Lines lines;
    private String splitCondition = "(?=(?<!GET)\\s(?!/))(?=(?<!Internet)\\s(?!Explorer))(?=(?<!Windows)\\s(?!\\d\\)))";
    private Pattern pattern = Pattern.compile(splitCondition);

    public ReadController(Lines lines) {
        this.lines = lines;
    }


    /**
     * Reads all lines one by one into the buffer and applies the pattern
     *
     * @param fileName Path where the logfile is located
     * @throws IOException throws an exception
     */
    public void readLineByLine(String fileName) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        while ((line = bufferedReader.readLine()) != null) {
            applyPattern(line);
        }
    }

    /**
     * Applies the previously set Pattern to the current line from the buffer
     *
     * @param line current line
     */
    private void applyPattern(String line) {
        LineModel lineModel;
        String[] parts = pattern.split(line);
        lineModel = new LineModel(clear(parts[0], String.class), clear(parts[1], String.class), clear(parts[2], String.class), clear(parts[3], Short.class), clear(parts[4], Short.class), clear(parts[5], String.class), clear(parts[6], String.class), clear(parts[7], String.class));
        lines.addLine(lineModel);
    }

    /**
     * Strips all unnecessary characters
     *
     * @param part current part to be stripped
     * @param type current type of the part String or Short
     * @return cleared String or Short value
     */
    private Object clear(String part, Class type) {
        if (part.equals("")) {
            return 0;
        }
        part = part.trim();
        part = part.replace("\"", "");
        part = part.replace("[", "");
        part = part.replace("]", "");
        part = part.replace("(", "");
        part = part.replace(")", "");

        if (String.class == type) return part;
        if (Short.class == type) return Short.parseShort(part);
        return -99;
    }


}
