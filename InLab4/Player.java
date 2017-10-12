
public class Player
{
   String name;
   int numAtBats;
   int numHits;
   //class variables
   
   public Player(String nameIn){
       name = nameIn;
    }
   //New player constructor
   
   public void addAtBats(int atBats){
       numAtBats = atBats;
   }
   
   public void addHits(int hits){
       numHits = hits;
   }
   
   public void printStat(){
      double batAve = ((double)numHits / (double)numAtBats);
      System.out.println("      " + name + "--->" + " At bats: " + numAtBats + ", Hits: " + numHits + ", Batting Avg: " + batAve); 
      
   }
}
