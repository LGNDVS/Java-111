public class Board
{
    private String[][] inBoard;
    
    public Board(){
        //Setting up a 2D array for the Tic Tac Toe game
        inBoard = new String[][]{{" ", " ", " ",},{" ", " ", " "},{" ", " " , " "}};
    }
    
    public void print(){
        //prints each elemnt of the board araay and the display format 
        System.out.println(inBoard[0][0] + "|" + inBoard[0][1] + "|" + inBoard[0][2]);
        System.out.println("-----");
        System.out.println(inBoard[1][0] + "|" + inBoard[1][1] + "|" + inBoard[1][2]);
        System.out.println("-----");
        System.out.println(inBoard[2][0] + "|" + inBoard[2][1] + "|" + inBoard[2][2]);
        System.out.println();
    }    
    
    public boolean gameOver(){
        //All the following for loops/ If statements are checking all 8 differnet possiblitles of winning/losing
        for(int i = 0; i < inBoard.length; i++){
            if(inBoard[i][0] != " " && inBoard[i][0] == inBoard[i][1] && inBoard[i][0] == inBoard[i][2]){
                return true;
            }
            
            else if(inBoard[0][i] != " " && inBoard[0][i] == inBoard[1][i] && inBoard[0][i] == inBoard[2][i]){
                return true;
            }
        }
        
        if(inBoard[0][0] != " " && inBoard[0][0] == inBoard[1][1] && inBoard[0][0] == inBoard[2][2]){
               return true;
        }
        
        else if(inBoard[2][0] != " " && inBoard[2][0] == inBoard[1][1] && inBoard[2][0] == inBoard[0][2]){
                return true;
        }
        
        for(int i = 0; i < inBoard.length; i++){
            for(int j = 0; j < inBoard.length; j++){
                if(inBoard[i][j] == " "){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public void printWinner(){
        boolean hasWon = false;
        
        //All the following for loops/ If statements are checking all 8 differnet possiblitles of winning
        for(int i = 0; i < inBoard.length; i++){
            if(inBoard[i][0] != " " && inBoard[i][0] == inBoard[i][1] && inBoard[i][0] == inBoard[i][2]){
                if(inBoard[i][0] == "X"){
                    System.out.println("Game Over!");
                    System.out.println("X" + " - won!");
                    hasWon = true;
                }
                else{
                    System.out.println("Game Over!");
                    System.out.println("O" + " - won!");
                    hasWon = true;
                }
            }
            
            else if(inBoard[0][i] != " " && inBoard[0][i] == inBoard[1][i] && inBoard[0][i] == inBoard[2][i]){
                if(inBoard[0][i] == "X"){
                    System.out.println("Game Over!");
                    System.out.println("X" + " - won!");
                    hasWon = true;
                }
                else{
                    System.out.println("Game Over!");
                    System.out.println("O" + " - won!");
                    hasWon = true;
                }
            }
        }
        
        if(inBoard[0][0] != " " && inBoard[0][0] == inBoard[1][1] && inBoard[0][0] == inBoard[2][2]){
                if(inBoard[0][0] == "X"){
                    System.out.println("Game Over!");
                    System.out.println("X" + " - won!");
                    hasWon = true;
                }
                else{
                    System.out.println("Game Over!");
                    System.out.println("O" + " - won!");
                    hasWon = true;
                }
        }
        
        else if(inBoard[2][0] != " " && inBoard[2][0] == inBoard[1][1] && inBoard[2][0] == inBoard[0][2]){
                if(inBoard[2][0] == "X"){
                    System.out.println("Game Over!");
                    System.out.println("X" + " - won!");
                    hasWon = true;
                }
                else{
                    System.out.println("Game Over!");
                    System.out.println("O" + " - won!");
                    hasWon = true;
                }
        }
        
        //Checking if the computer won and the board is full at the same time. Only printing one answer not both.
        boolean isFull = true;
        for(int i = 0; i < inBoard.length; i++){
            for(int j = 0; j < inBoard.length; j++){
                if(inBoard[i][j] == " "){
                    isFull = false;
                }
            }
        }
        if(isFull && !hasWon){
            System.out.println("Game Over!");
            System.out.println("Board is full. Tie!");
        }
    }
    
    //The set space method
    public void setSpace(int row, int col, String mark){
        inBoard[row][col] = mark;
    }
    
    //The get space method
    public String getSpace(int row, int col){
        return inBoard[row][col];
    }
}

