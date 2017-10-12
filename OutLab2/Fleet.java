//Fleet Class
public class Fleet
{
    Ship carrier, antiSubmarine, patrol, destroyer;
   
    public Fleet(Ship ship1, Ship ship2, Ship ship3, Ship ship4){
        carrier = ship1;
        antiSubmarine = ship2;
        patrol = ship3;
        destroyer = ship4;
        //setting the specific ships with their names
    }
    
    public void deploy(){
        carrier.move();
        antiSubmarine.move();
        patrol.move();
        destroyer.move();
        //commanding each ship to move
    }
    
    public void reFuel(){
        carrier.reFuel();
        antiSubmarine.reFuel();
        patrol.reFuel();
        destroyer.reFuel();
        //refueling each individual ship
    }
    
    public void printSummary(){
        carrier.shipInfo();
        antiSubmarine.shipInfo();
        patrol.shipInfo();
        destroyer.shipInfo();
        //printing out the outcome of the entire fleet deployment
    }
    
    










}