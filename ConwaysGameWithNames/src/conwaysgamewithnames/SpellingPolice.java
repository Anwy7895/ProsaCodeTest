/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaysgamewithnames;

/**
 *
 * @author sofie
 */
public class SpellingPolice {
    public SpellingPolice(){
    
    }
    
    public boolean onlyAlphabetCharacters(String str){
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }
}
