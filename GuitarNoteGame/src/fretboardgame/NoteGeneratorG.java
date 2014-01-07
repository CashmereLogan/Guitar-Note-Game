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
public enum NoteGeneratorG {
    
    G("G"),
    G_Sharp("G#"),
    A("A"),
    A_Sharp("A#"),
    B("B"),
    C("C"),
    C_Sharp("C#"),
    D("D"),
    D_Sharp("D#"),
    E("E"),
    F("F"),
    F_Sharp("F#");
    
    private String name;
    
    private NoteGeneratorG(String noteName){
        this.name=noteName;
    }
    
    public String getNoteName(){
        return name;
    }
    
}
