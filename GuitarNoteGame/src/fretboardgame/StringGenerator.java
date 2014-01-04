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
public enum StringGenerator {
    
    e_STRING("e String"),
    B_STRING("B String"),
    G_STRING("G String"),
    D_STRING("D String"),
    A_STRING("A String"),
    E_STRING("E String");
    
    private String name;
    
    private StringGenerator(String stringName){
        this.name=stringName;
    }
    
    public String getStringName(){
        return name;
    } 
}
