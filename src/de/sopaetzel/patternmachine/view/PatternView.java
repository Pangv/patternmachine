package de.sopaetzel.patternmachine.view;


import javax.swing.*;
import java.awt.*;

public class PatternView extends JFrame {


    // Properties
    private String frameTitle;
    private Dimension dimension = new Dimension(500, 500);

    // Components
    private JPanel jPanel;
    private JButton jButton_readFile;
    //// Menu
    private JMenuBar jMenuBar;
    private JMenu jMenu;
    private JMenuItem jMenuItem_read;
    private JMenuItem jMenuItem_analyze;


    public PatternView(String title) throws HeadlessException {
        super(title);
        showView();
    }

    public void showView() {
        initComponents();
        addComponents();
        initFrame();
    }

    private void initFrame() {
        this.setSize(this.dimension);
        this.setResizable(false);
        this.setVisible(true);

    }

    private void initComponents() {
        this.jPanel = new JPanel();
        this.jPanel.setSize(this.dimension);
        this.jButton_readFile = new JButton("Read Logfile!");
        this.jButton_readFile.setBorderPainted(false);


        // Menu
        this.jMenuBar = new JMenuBar();
        this.jMenu = new JMenu("Optionen");
        this.jMenuBar.add(jMenu);
        this.jMenuItem_read = new JMenuItem();
        jMenuItem_read.setText("Read");
        this.jMenuItem_analyze = new JMenuItem();
        jMenuItem_analyze.setText("Analyze");
        this.jMenu.add(jMenuItem_read);
        this.jMenu.add(jMenuItem_analyze);
        // \Menu
    }

    private void addComponents() {
        this.add(this.jPanel);
        this.setJMenuBar(jMenuBar);
        this.jPanel.add(jButton_readFile);

    }


}
