package com.javarush.test.GameReplace.Midi;

import javax.sound.midi.*;

/**
 * Created by Mistes on 05.06.2016.
 */
public class MinimusicApp
{

    public static void main(String[] args)
    {
        MinimusicApp mini = new MinimusicApp();
        mini.play();

    }
    public void play(){
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq  = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(192,1, 102,100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,35,100);

            MidiEvent noteOFF = new MidiEvent(b, 16);
            track.add(noteOFF);

            player.setSequence(seq);

            player.start();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
