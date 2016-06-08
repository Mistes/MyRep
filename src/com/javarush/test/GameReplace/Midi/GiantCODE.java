package com.javarush.test.GameReplace.Midi;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Администратор on 08.06.2016.
 */
public class GiantCODE
{
    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxList;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
   JFrame theFrame;

    String[] instrumentNames = {"Bass drum", "Closed Hi-Hat","Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap"
    ,"High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell","Vibraslap", "Low-mid Tom", "High-Agogo", "Open Hi Conga"};
    int[]instuments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

    public static void main(String[] args)
    {
        new GiantCODE().buildGUI();
    }
    public void buildGUI(){
        theFrame = new JFrame("Cyber Beatbox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background =new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkBoxList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
      //  start.addActionListener(new MyStartListener());
        buttonBox.add(start);


        JButton stop = new JButton("Stop");
       // stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo UP");
     //   upTempo.addActionListener(new UpTempoListener());
        buttonBox.add(upTempo);


        JButton downTempo = new JButton("Tempo DOWN");
      //  downTempo.addActionListener(new DownTempoListener());
        buttonBox.add(downTempo);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for(int i = 0; i<16; i++){
            nameBox.add(new Label(instrumentNames[i]));
        }

        background.add(BorderLayout.EAST, buttonBox);
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(16,16);
        grid.setVgap(1);
        grid.setVgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for(int i = 0; i < 256; i++){
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkBoxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();

        theFrame.setBounds(50,50,300,300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    public void setUpMidi(){
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);

        }catch (Exception e){e.printStackTrace();}
    }
}
