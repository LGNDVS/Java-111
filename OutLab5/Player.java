import java.util.Scanner;

public class Player
{
    Board board;
    String name;
    Scanner in = new Scanner(System.in);
    
    public Player(Board inBoard, String mark){
        board = inBoard;
        name = mark;
    }
    
    public void computerMove(){
        //Having the computer generate a number between 0-2 and assigning it to a random slot in the array
        int row = (int)(Math.random()*3);
        int col = (int)(Math.random()*3);
        
        //checking if the board space is filled and assigning number to another space
        if(board.getSpace(row, col)== " " ){
            board.setSpace(row, col, name);
        }
        else{
            this.computerMove();
        }
    }

    
    public void humanMove(){
        //Following steps let the user pick the space he wants to play in
        //row entry
        System.out.println("What row would you like? >");
        int row = in.nextInt();
        
        //column entry
        System.out.println("What column would you like? >");
        int col = in.nextInt();
        
        System.out.println();
        
        //The following if statement is checking if the board is full and making you try agian
        if(board.getSpace(row, col)== " " ){
            board.setSpace(row, col, name);
        }
        else{
            System.out.println("That row is already occupied, select again...");
            this.humanMove();
        }
    }
}
