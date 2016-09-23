package de.sopaetzel.patternmachine.model;

import java.util.ArrayList;

public class Lines {

    private static ArrayList<Line> allLines = new ArrayList<Line>();

    public void addLine(String ip, String ts, String target, short response, short delay, String url, String browser, String os) {
        this.allLines.add(new Line(ip, ts, target, response, delay, url, browser, os));
    }


}
