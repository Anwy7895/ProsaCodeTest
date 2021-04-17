/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaysgamewithnames;

import java.util.Scanner;

/**
 *
 * @author sofie
 */
public class UserInterface {
    
    private String name = null; 
    private ArtCreator currentArt = null; 
    private ConwayAnimator currentAnimator = null; 
    private Scanner scanner = null;
    private SpellingPolice spellingPolice = null; 
    
    public UserInterface(){
        try {
            scanner = new Scanner(System.in);
        } catch (Exception e) {
        }
        spellingPolice = new SpellingPolice(); 
    }
    
    public void start(){
        gameLoop();
    }
    
    private void gameLoop(){
        boolean inGame = true; 
        String input = null;
        
        while(inGame){
            while(name == null){
                System.out.println("Please enter your first name");
                try {
                    input = scanner.nextLine(); 
                } catch (Exception e) {
                    System.out.println("Sorry, that is an invalid input, "
                        + "\n only using the 29 letters in the alphabet");
                    System.out.println("");
                    name = null; 
                }
                if(!spellingPolice.onlyAlphabetCharacters(input)){
                    name = null; 
                    System.out.println("Sorry, that is an invalid input, ");
                    System.out.println("only using the 29 letters in the alphabet");
                    System.out.println("");
                }else{
                    name = input; 
                }
            }
            
            if(currentAnimator == null && currentArt == null){
                currentArt = new ArtCreator(name);
                currentAnimator = new ConwayAnimator(currentArt.getArtGrid());
            }
            
            System.out.println("Enter command: ");
            input = scanner.nextLine();
            input.toUpperCase(); 
            
            switch(input){
                case "step":
                    currentAnimator.animateOneStep();
                    break;
                case "run":
                    currentAnimator.animate20Steps();
                    break;
                case "reset":
                    currentAnimator.setAnimatorGrid(currentArt.getArtGrid());
                    break;
                case "stop":
                    inGame = false; 
                    break;
                case "help": 
                    System.out.println("\033[0;1m" + "Commands: ");
                    System.out.println("Step: Goes forward one step in the "
                            + "Conways game of letters");
                    System.out.println("Run: Runs 20 steps of the Conways "
                            + "game of letters");
                    System.out.println("Reset: Resets the art back to your "
                            + "original text");
                    System.out.println("Stop: Stops the application");
                    System.out.println("Help: Ehhh, do you really need this?");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Try to type help to see available"
                            + " commands");
                    currentAnimator.print();
                    break;
                    
            }
        }
    }
    
    private static void sleepTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("oh no sleep");
        }
    }
    
}
