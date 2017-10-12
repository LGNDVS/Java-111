
public class Team
{
    Player p1,p2,p3;
    String name;
    

    public Team(String inName, Player inP1, Player inP2, Player inP3){
        name = inName;
        p1 = inP1;
        p2 = inP2;
        p3 = inP3;
    }
    
    
    public void printStats(){
        double batAve = ((double)(p1.numHits + p2.numHits + p3.numHits) / (double)(p1.numAtBats + p2.numAtBats + p3.numAtBats));
        System.out.println(name + ":\n    At Bats: " + (p1.numAtBats + p2.numAtBats + p3.numAtBats));
        System.out.println("    Hits: " + (p1.numHits + p2.numHits + p3.numHits));
        System.out.println("    Batting Avg: " + batAve);
        System.out.println("    Players:");
        p1.printStat();
        p2.printStat();
        p3.printStat();
    }
}
