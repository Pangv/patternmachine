package de.sopaetzel.patternmachine.model;

public class Line {

    private String ipAdress;
    private String timestamp;
    private String target;
    private short responseCode;
    private short timeToResponse;
    private String url;
    private String clientBrowser;
    private String clientOS;

    public Line(String ipAdress, String timestamp, String target, short responseCode, short timeToResponse, String url, String clientBrowser, String clientOS) {
        this.ipAdress = ipAdress;
        this.timestamp = timestamp;
        this.target = target;
        this.responseCode = responseCode;
        this.timeToResponse = timeToResponse;
        this.url = url;
        this.clientBrowser = clientBrowser;
        this.clientOS = clientOS;
    }
}
