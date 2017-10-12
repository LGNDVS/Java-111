import java.util.Scanner;


public class Battleship
{
    //instance variables for all the methods throughout the game
    private int row;
    private int col;
    private String[][] valuesArray;
    private boolean[][] visibleArray;
    private boolean isHorizontal;
    Scanner in = new Scanner(System.in);
    private int numGuess = 0;
    
    public Battleship(int inRow, int inCol){
        row = inRow;
        col = inCol;
    }
    
    public void setBoard(){
        //initalizing the arrays for the board
        valuesArray = new String[row][col];
        visibleArray = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                valuesArray[i][j] = "0";
            }
        }
        
        for(int i = 2; i < 6;i++){
            int randomRow =(int)(Math.random()*row);
            int randomCol =(int)(Math.random()*col);
            
            while(!Placement(randomRow, randomCol, i)){
                 randomRow =(int)(Math.random()*row);
                 randomCol =(int)(Math.random()*col);
            }
            
            for(int j = 0; j < i; j++){
                if(isHorizontal){
                    valuesArray[randomRow + j][randomCol] = i + "";
                }
                
                else{
                    valuesArray[randomRow][randomCol + j] = i + "";
                }
                
            }   
        }
     }
    
    
    public boolean Placement(int inRow, int inCol, int shipSize){
        boolean isEmpty = true;
    
        if((Math.random()< 0.5)){
            isHorizontal = true;
            
            for(int i = 0; i < shipSize; i++){
                if((inRow + i) >= valuesArray.length || valuesArray[inRow + i][inCol] != "0"){
                    isEmpty = false;
                }
            }
        }
    
        else{
           isHorizontal = false;
           
            for(int i = 0; i < shipSize; i++){
                if((inCol + i) >= valuesArray[0].length || valuesArray[inRow][inCol + i] != "0"){
                    isEmpty = false;
                }
           } 
        }
    
        return isEmpty;
    }
    
    public void printBoard(boolean Board){
        if(Board){
            //following loops are for seeting the board depeniding on the size of the array. Not always in a fixed position.
            for(int j = 0; j < row; j++){
                System.out.print("  ");
                for(int i = 0;i < col; i ++){
                        System.out.print("+-");
                }
                System.out.print("+");
                System.out.println();
                
                System.out.print((j + 1) +" ");
                for(int i = 0;i < col; i ++){
                        System.out.print("|" + valuesArray[j][i]);
                }
                    System.out.print("|");
                    System.out.println();
            }
            
            System.out.print("  ");
            for(int i = 0;i < col; i ++){
                        System.out.print("+-");
            }
            System.out.print("+");
            System.out.println("   ");
            
            System.out.print("   ");
            for(int i = 0;i < col; i ++){
                System.out.print((i + 1) + " ");
            }
            System.out.println("\n");    
        }
        
        else{
            for(int j = 0; j < row; j++){
                
                System.out.print("  ");
                for(int i = 0;i < col; i ++){
                        System.out.print("+-");
                }
                System.out.print("+");
                System.out.println();
                
                System.out.print((j + 1) +" ");
                for(int i = 0;i < col; i ++){
                        if(visibleArray[j][i]){
                            System.out.print("|" + valuesArray[j][i]);
                        }
                        else{
                            System.out.print("| ");
                        }
                        
                }
                    System.out.print("|");
                    System.out.println();
            }
            
            System.out.print("  ");
            for(int i = 0;i < col; i ++){
                        System.out.print("+-");
            }
            System.out.print("+");
            System.out.println("   ");
            
             System.out.print("   ");
            for(int i = 0;i < col; i ++){
                System.out.print((i + 1) + " ");
            }
            System.out.println("\n"); 
        }
        
        
    }
    
    public void makeGuess(){
        int rowGuess = 0;
        int colGuess = 0;
        boolean validInput = true;
        String input;
        
        System.out.print("Enter a row to guess > ");
        
        input = in.next();    
        try{  
            rowGuess= Integer.parseInt(input);
            }
            catch(Exception e){
                System.out.println("Error. You did not enter an integer value. PLease try again.");
                validInput = false;
            }
        
        if(validInput){
            System.out.print("Enter a column to guess > ");
            input = in.next();
            try{
                 colGuess= Integer.parseInt(input);
            }
            catch(Exception e){
                System.out.println("Error. You did not enter an integer value. PLease try again.");
                validInput = false;
            }
        }
        
        if(validInput){
            if( 0 > rowGuess || rowGuess > row){
                System.out.println("Error: Invalid row.");
            }
            
            else if(0 > colGuess || colGuess > col){
                System.out.println("Error: Invalid column.");
            }
            
            else if(visibleArray[rowGuess - 1][colGuess - 1] == true){
                
                System.out.println("You already guessed that location!");
            }
            
            else{
                String stringGuess = valuesArray[rowGuess - 1][colGuess - 1];
                
                switch(stringGuess){
                    //picks what boat has been hit form the guess.
                    case "0":
                        System.out.println("Miss!  There was nothing at that location");
                        break;
                    case "2":
                        System.out.println("Hit!  You just hit the Patrol Boat");
                        break;
                    case "3":
                        System.out.println("Hit!  You just hit the Submarine");
                        break;
                    case "4": 
                        System.out.println("Hit!  You just hit the Battleship");
                        break;
                    case "5":
                        System.out.println("Hit!  You just hit the Carrier");
                        break;
                }
                
                visibleArray[rowGuess - 1][colGuess - 1] = true;
                numGuess++;
            }
        }    
        System.out.println();
    }
    
    public boolean over(){
        boolean gameOver = true;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(valuesArray[i][j] != "0"){
                    if(visibleArray[i][j] == false){
                        gameOver = false;
                    }
                }
            }
        }
        return gameOver;
    }
    
    public void printStatistics(){
        //prints the number of uess it has tried
        System.out.println("Congratulations! You sunk the enemy fleet using " + numGuess + " guesses.  Game over.");
    }
}