/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fretboardgame;

/**
 *
 * @author Logan
 */
public enum NoteGenerator {
    
    A("A"),
    A_Sharp("A#"),
    B("B"),
    C("C"),
    C_Sharp("C#"),
    D("D"),
    D_Sharp("D#"),
    E("E"),
    F("F"),
    F_Sharp("F#"),
    G("G"),
    G_Sharp("G#");
    
    private String name;
    
    private NoteGenerator(String noteName){
        this.name=noteName;
    }
    
    public String getNoteName(){
        return name;
    }
    
}
