/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fretboardgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Logan
 */
public class FretboardGameMain {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Press 'Enter' to start the game.");
        s.nextLine();
        Random r = new Random();
        
        StringGenerator[] stringNames = StringGenerator.values();   
        int stringLength = stringNames.length;
        int stringPick = r.nextInt(stringLength);
        
        NoteGenerator[] noteNames = NoteGenerator.values();
        int noteLength = noteNames.length;
        int notePick = r.nextInt(noteLength);
        
        System.out.print("Select the " + (noteNames[notePick].getNoteName()) + " note ");
        System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
        
        FretDisplay obj = new FretDisplay();
    }
    
}
