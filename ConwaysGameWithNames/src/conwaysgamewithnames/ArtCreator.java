/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaysgamewithnames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 *
 * @author sofie
 */
public class ArtCreator {
    private String name; 
    
    private String[][] artGrid; 
    
    public ArtCreator(String name){
        this.name = name.toUpperCase();
        populateLines();
    }
    
    private void populateLines(){
        artGrid = new String[7][name.length()*5+name.length()+1];
        
        for (int i = 0; i < name.length(); i++) {
            String letter = name.charAt(i) + "";
            
            String[] asciiLetter = AsciiAlphabet.letters.get(letter); 
            
            artGrid[0][5*i+i] = "-";
            artGrid[1][5*i+i] = "-";
            artGrid[2][5*i+i] = "-";
            artGrid[3][5*i+i] = "-";
            artGrid[4][5*i+i] = "-";
            artGrid[5][5*i+i] = "-";
            artGrid[6][5*i+i] = "-";
            
            for(int  j = 0; j < 7; j++){                
                artGrid[j][5*i+i+1] = asciiLetter[j*5];
                artGrid[j][5*i+i+2] = asciiLetter[j*5+1];
                artGrid[j][5*i+i+3] = asciiLetter[j*5+2];
                artGrid[j][5*i+i+4] = asciiLetter[j*5+3];
                artGrid[j][5*i+i+5] = asciiLetter[j*5+4]; 
            } 
        }
        
        artGrid[0][name.length()*5+name.length()] = "-";
        artGrid[1][name.length()*5+name.length()] = "-";
        artGrid[2][name.length()*5+name.length()] = "-";
        artGrid[3][name.length()*5+name.length()] = "-";
        artGrid[4][name.length()*5+name.length()] = "-";
        artGrid[5][name.length()*5+name.length()] = "-";
        artGrid[6][name.length()*5+name.length()] = "-";
        
        for(String[] arr: artGrid){
            for(String symbol : arr){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    public String[][] getArtGrid(){
        return this.artGrid; 
    }
}
