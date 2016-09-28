package de.sopaetzel.patternmachine.view;

import de.sopaetzel.patternmachine.controller.ReadController;
import de.sopaetzel.patternmachine.model.Lines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PatternViewC {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Lines lines = new Lines();
    private ReadController readController = new ReadController(lines);


    @SuppressWarnings("SpellCheckingInspection")
    public int showMenu() throws IOException {
        System.out.println("MENU");
        System.out.println("0) Lade Logdatei");
        System.out.println("1) Browser Verteilung");
        System.out.println("2) OS Verteilung");
        System.out.println("3) Response Code Häufigkeit");
        System.out.println("4) Target Häufigkeit");
        System.out.println("5) Größe aller Responses im Log");
        int item = Integer.parseInt(br.readLine());
        chooseItem(item);
        return item;
    }


    private void chooseItem(int item) throws IOException {
        switch (item) {
            case 0:
                readController.readLineByLine("./assets/logfile_2016-9-16_2016-9-23.log");
                break;
            case 1:
                System.out.println("Browser Verteilung");
                lines.getBrowserCount("Mozilla");
                lines.getBrowserCount("Internet Explorer");
                lines.getBrowserCount("Chrome");
                break;
            case 2:
                System.out.println("OS Verteilung");
                lines.getOSCount("Windows");
                lines.getOSCount("Linux");
                lines.getOSCount("macOS");

                break;
            case 3:
                System.out.println("Response Code Häufigkeit");
                lines.getResponseCodeCount((short) 200);
                lines.getResponseCodeCount((short) 400);
                lines.getResponseCodeCount((short) 404);
                lines.getResponseCodeCount((short) 502);
                lines.getResponseCodeCount((short) 503);
                break;
            case 4:
                System.out.println("Target Häufigkeit");
                lines.getTargetCount("index");
                break;
            case 5:
                System.out.println("Größe aller Reponses im Log");
                lines.calcOverAllSize();
                break;
        }
    }


}
