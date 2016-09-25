package de.sopaetzel.patternmachine.model;

import java.util.ArrayList;

public class Lines {

    private ArrayList<LineModel> allLines = new ArrayList<>();


    private int countOS() {
        int toReturn = 0;


        return toReturn;
    }


    private int countBrowser(String browser) {
        int toReturn = 0;
        for (LineModel line : allLines) {
            if (line.getClientBrowser().contains(browser)) {
                toReturn++;
            }
        }
        return toReturn;

    }

    private int countTargets(String target) {
        int toReturn = 0;
        for (LineModel line : allLines) {
            if (line.getTarget().contains(target)) {
                toReturn++;
            }
        }
        return toReturn;
    }

    public void getBrowserCount(String clientBrowser) {
        System.out.println("The Browser Count for " + clientBrowser + " is " + countBrowser(clientBrowser));
    }

    public void getTargetCount(String target) {
        System.out.println("The Target count for " + target + " is " + countTargets(target));
    }

    public void addLine(LineModel lineModel) {
        this.allLines.add(lineModel);
    }








}
