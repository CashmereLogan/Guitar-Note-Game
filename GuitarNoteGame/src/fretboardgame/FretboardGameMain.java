/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fretboardgame;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Logan
 */
public class FretboardGameMain {

    public static void main(String[] args) {

        int points = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Press 'Enter' to start the game.");
        s.nextLine();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            StringGenerator[] stringNames = StringGenerator.values();
            int stringLength = stringNames.length;
            int stringPick = r.nextInt(stringLength);

            int notePick = 0;
            FretDisplay obj = new FretDisplay();
            obj.display();

            if (stringPick == 0) {
                NoteGeneratorHighE[] noteNames = NoteGeneratorHighE.values();
                int noteLength = noteNames.length;
                notePick = r.nextInt(noteLength);
                System.out.print("Enter the fret of the " + (noteNames[notePick].getNoteName()) + " note ");
                System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
            } else if (stringPick == 1) {
                NoteGeneratorB[] noteNames = NoteGeneratorB.values();
                int noteLength = noteNames.length;
                notePick = r.nextInt(noteLength);
                System.out.print("Enter the fret of the " + (noteNames[notePick].getNoteName()) + " note ");
                System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
            } else if (stringPick == 2) {
                NoteGeneratorG[] noteNames = NoteGeneratorG.values();
                int noteLength = noteNames.length;
                notePick = r.nextInt(noteLength);
                System.out.print("Enter the fret of the " + (noteNames[notePick].getNoteName()) + " note ");
                System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
            } else if (stringPick == 3) {
                NoteGeneratorD[] noteNames = NoteGeneratorD.values();
                int noteLength = noteNames.length;
                notePick = r.nextInt(noteLength);
                System.out.print("Enter the fret of the " + (noteNames[notePick].getNoteName()) + " note ");
                System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
            } else if (stringPick == 4) {
                NoteGeneratorA[] noteNames = NoteGeneratorA.values();
                int noteLength = noteNames.length;
                notePick = r.nextInt(noteLength);
                System.out.print("Enter the fret of the " + (noteNames[notePick].getNoteName()) + " note ");
                System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
            } else {
                NoteGeneratorE[] noteNames = NoteGeneratorE.values();
                int noteLength = noteNames.length;
                notePick = r.nextInt(noteLength);
                System.out.print("Enter the fret of the " + (noteNames[notePick].getNoteName()) + " note ");
                System.out.println("on the " + (stringNames[stringPick].getStringName()) + ".");
            }

            int input = s.nextInt();
            CheckInput check = new CheckInput();
            boolean answer = check.String(input, notePick);
            String grammar = "point";
            if (answer) {
                System.out.println("You're right!");
                points++;
                if (points == 0 || points > 1) {
                    grammar = "points";
                }
                System.out.println("You have " + points + " " + grammar + ".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FretboardGameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("You're wrong.");
                if (points > 0) {
                    points--;
                }
                System.out.println("You have " + points + " " + grammar + ".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FretboardGameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Congrats!");
        System.out.println("Total Points: " + points);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FretboardGameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Created by: CashmereLogan");
    }

}
