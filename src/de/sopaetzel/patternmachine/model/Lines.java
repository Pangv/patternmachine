package de.sopaetzel.patternmachine.model;

import java.util.ArrayList;

public class Lines {

    private static ArrayList<LineModel> allLines = new ArrayList<LineModel>();

    public void addLine(String ip, String ts, String target, short response, short delay, String url, String browser, String os) {
        this.allLines.add(new LineModel(ip, ts, target, response, delay, url, browser, os));
    }


}
