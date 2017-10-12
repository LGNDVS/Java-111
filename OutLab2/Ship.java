//Ship Class, Logan Davis
public class Ship
{
    String name;
    int fuelCapacity, fuelOn;
    int fuelConsumed = 0;
    //class variables
    
    public Ship(String nameIn, int fuelCap){
        name = nameIn;
        fuelCapacity = fuelCap;
        fuelOn = fuelCap;
        //new ship constructor
    }
    
    public void move()
    {
        fuelOn /= 2;
        fuelConsumed += fuelOn;
        //each time you move, you consume half of your fuel on board
    }
    
    public void reFuel(){
        fuelOn = fuelCapacity;
        //refueling the ship to maxium capacity
    }
    
    public void shipInfo(){
        System.out.println(name + " has consumed " + fuelConsumed + " fuel units");
        //print line for each ships fuel consumption
    }
}