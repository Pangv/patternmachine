package de.sopaetzel.patternmachine.application;

import de.sopaetzel.patternmachine.controller.ReadController;
import de.sopaetzel.patternmachine.view.PatternView;

import java.io.IOException;

public class App {


    public static void main(String[] args) {

        //   PatternView patternView = new PatternView("Pattern Machine");


        ReadController readController = new ReadController();


        try {
            readController.readLineByLine("./assets/logfile_2016-9-16_2016-9-23.log");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
