package de.sopaetzel.patternmachine.application;

import de.sopaetzel.patternmachine.controller.ReadController;
import de.sopaetzel.patternmachine.model.Lines;

import java.io.IOException;

public class App {


    public static void main(String[] args) {


        Lines lines = new Lines();

        //   PatternView patternView = new PatternView("Pattern Machine");


        ReadController readController = new ReadController(lines);


        try {
            readController.readLineByLine("./assets/logfile_2016-9-16_2016-9-23.log");
            System.out.println("Successfully read");

            // Test Output Browser
            System.out.println("+++BROWSER COUNT+++");
            lines.getBrowserCount("Chrome");
            lines.getBrowserCount("Internet");
            lines.getBrowserCount("Mozilla");
            lines.getBrowserCount("Opera");
// Test Output Target
            lines.getTargetCount("index");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
