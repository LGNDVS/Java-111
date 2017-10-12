
public class PetalsGame
{
  int[] rolls = new int[5];
  int totalPetals = 0;
  
  public void rollDice(){
      for(int i = 0; i < rolls.length; i++){
          rolls[i] = (int)(Math.random()*6+1);
    }
  }
  
  public void printDice(){
      System.out.println("You rolled the following: " + rolls[0] + ", " + rolls[1] + ", " + rolls[2]  + ", " + rolls[3]+ ", " + rolls[4]);
  }
  
  public int calculateAllPetals(){
      int totalPetals = 0;
      
      for(int i = 0; i < rolls.length;i++){
          if(rolls[i] == 3){
               totalPetals += 2;
          }
          else if(rolls[i] == 5){
              totalPetals += 4;
          }
      }
      return totalPetals;
  }
}

