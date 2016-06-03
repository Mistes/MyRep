package com.javarush.test.GameReplace;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by Администратор on 03.06.2016.
 */
public class MidiPlayer
{
    public void  play(){
        try
        {
            Sequencer sequencer = MidiSystem.getSequencer();
        }catch (MidiUnavailableException e){
            System.out.println(e);
        }
        System.out.println("We have sequenser for now!");
    }

    public static void main(String[] args)
    {
        MidiPlayer mp = new MidiPlayer();
        mp.play();
    }
}
