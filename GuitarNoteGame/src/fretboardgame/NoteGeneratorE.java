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
public enum NoteGeneratorE {
   
    E("E"),
    F("F"),
    F_Sharp("F#"),
    G("G"),
    G_Sharp("G#"),
    A("A"),
    A_Sharp("A#"),
    B("B"),
    C("C"),
    C_Sharp("C#"),
    D("D"),
    D_Sharp("D#");
    
    private String name;
    
    private NoteGeneratorE(String noteName){
        this.name=noteName;
    }
    
    public String getNoteName(){
        return name;
    }
    
}
