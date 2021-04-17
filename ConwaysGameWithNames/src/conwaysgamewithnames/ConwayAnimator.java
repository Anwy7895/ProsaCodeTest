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
public class ConwayAnimator {
    private String[][] animatorGrid; 
    
    public ConwayAnimator(String[][] base){
        animatorGrid = new String[base.length]
                                    [base[0].length];
        for(int i = 0; i < base.length; i++){
            for(int j = 0; j < base[0].length; j++){
                animatorGrid[i][j] = base[i][j];
            }
        }
    }
    
    public void animateOneStep(){
        nextGeneration(animatorGrid);
        print();
    }
    
    public void animate20Steps(){
        for(int i = 0; i < 20; i++){
            nextGeneration(animatorGrid);
            print();
            sleepTime(1000);
        }
    }
    
    private void nextGeneration(String[][] originalGrid){
        String[][] tempGrid = new String[animatorGrid.length]
                                    [animatorGrid[0].length];
        for(int i = 0; i < animatorGrid.length; i++){
            for(int j = 0; j < animatorGrid[0].length; j++){
                tempGrid[i][j] = animatorGrid[i][j];
            }
        }
        
        int neighborCount; 
        for(int i = 0; i < animatorGrid.length; i++){
            System.out.println("");
            for(int j = 0; j < animatorGrid[0].length; j++){
                neighborCount = amountOfNeighbors(i, j); 
                if(conwaysGameRules(neighborCount, 
                        animatorGrid[i][j].contains("#"))){
                    tempGrid[i][j] = "#";
                }else{
                    tempGrid[i][j] = "-";
                }
            }
        }
        this.animatorGrid = tempGrid; 
    }
    
    private int amountOfNeighbors(int row, int col){
        int aliveOrDead = 0; 
        if(animatorGrid[row][col].contains("#")){
            //cause it's going to count it self
            aliveOrDead = -1; 
        }
        
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = col - 1; j <= col + 1; j++){
                
                if(insideGrid(i, j) && animatorGrid[i][j].contains("#")){
                    aliveOrDead++; 
                }
            }
        }
        return aliveOrDead; 
    }
    
    private boolean conwaysGameRules(int amountOfNeighbors, boolean isAlive){
        if(isAlive && (amountOfNeighbors == 2 || amountOfNeighbors == 3)){
            return true;
        }else if(!isAlive && amountOfNeighbors == 3){
            return true; 
        }else{
            return false; 
        }
    }
    
    private boolean insideGrid(int row, int col){
        if(row >= 0 && row < animatorGrid.length &&
                col >= 0 && col < animatorGrid[0].length){
            return true; 
        }else{
            return false; 
        }
    }
    
    public void print(){
        for(String[] arr: animatorGrid){
            for(String symbol : arr){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    private void printWithoutSpace(){
        for(String[] arr: animatorGrid){
            for(String symbol : arr){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
    
    private static void sleepTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("oh no sleep");
        }
    }
    
    public void setAnimatorGrid(String[][] base){
        for(int i = 0; i < base.length; i++){
            for(int j = 0; j < base[0].length; j++){
                animatorGrid[i][j] = base[i][j];
            }
        }
        print();
    }
    
}
