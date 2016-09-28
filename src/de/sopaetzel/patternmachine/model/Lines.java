package de.sopaetzel.patternmachine.model;

import java.util.ArrayList;

public class Lines {

    private ArrayList<LineModel> allLines = new ArrayList<>();


    private int countOS(String os) {
        int toReturn = 0;
        for (LineModel line : allLines) {
            if (line.getClientOS().contains(os)) {
                toReturn++;
            }
        }
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

    private int countResponseCodes(short code) {
        int toReturn = 0;

        for (LineModel line : allLines) {
            if (line.getResponseCode() == code) {
                toReturn++;
            }
        }

        return toReturn;
    }

    public void calcOverAllSize() {
        int toReturn = 0;
        for (LineModel line : allLines) {
            toReturn += line.getResponseSize();
        }
        System.out.println("The size of all responses accumulated is " + toReturn);
    }

    public void getBrowserCount(String clientBrowser) {
        System.out.println("The Browser Count for " + clientBrowser + " is " + countBrowser(clientBrowser));
    }

    public void getTargetCount(String target) {
        System.out.println("The Target count for " + target + " is " + countTargets(target));
    }
    public void getOSCount(String os){
        System.out.println("The OS count for " + os + " is " + countOS(os));
    }

    public void getResponseCodeCount(short code) {
        System.out.println("The Response Code count for " + code + " is " + countResponseCodes(code));
    }

    public void addLine(LineModel lineModel) {
        this.allLines.add(lineModel);
    }


}
