package de.sopaetzel.patternmachine.model;

public class LineModel {


    private String ipAdress;
    private String timestamp;
    private String target;
    private short responseCode;
    private short responseSize;
    private String url;
    private String clientBrowser;
    private String clientOS;

    public LineModel(Object ipAddress, Object timestamp, Object target, Object responseCode, Object responseSize, Object url, Object clientBrowser, Object clientOS) {
        this.ipAdress = String.valueOf(ipAddress);
        this.timestamp = String.valueOf(timestamp);
        this.target = String.valueOf(target);
        this.responseCode = new Short(String.valueOf(responseCode));
        this.responseSize = new Short(String.valueOf(responseSize));
        this.url = String.valueOf(url);
        this.clientBrowser = String.valueOf(clientBrowser);
        this.clientOS = String.valueOf(clientOS);
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTarget() {
        return target;
    }

    public short getResponseCode() {
        return responseCode;
    }

    public short getResponseSize() {
        return responseSize;
    }

    public String getUrl() {
        return url;
    }

    public String getClientBrowser() {
        return clientBrowser;
    }

    public String getClientOS() {
        return clientOS;
    }
}
