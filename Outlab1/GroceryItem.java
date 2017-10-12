
public class GroceryItem
{
    String name;
    double cost;
    int aisleNum;

    
    public GroceryItem(String name, double cost, int aisleNum){
        this.name=name;
        this.cost=cost;
        this.aisleNum=aisleNum;
    }
   
    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public int getAisleNum(){
        return aisleNum;
    }
    public void changeCost(double newCost){
        this.cost=newCost;
    }
}

