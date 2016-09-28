package de.sopaetzel.patternmachine.application;

import de.sopaetzel.patternmachine.view.PatternViewC;

import java.io.IOException;

public class App {


    public static void main(String[] args) {
        //   PatternView patternView = new PatternView("Pattern Machine");
        PatternViewC patternViewC = new PatternViewC();
        try {
            while (patternViewC.showMenu() != 99) {
                patternViewC.showMenu();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Successfully read");


    }

}
