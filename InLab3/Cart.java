
/**
 * Write a description of class Cart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cart
{
    private String name;
    private GroceryItem item1, item2;
    private int num1, num2;
    
    public Cart(String inName){
        name = inName;
    }
    
    public void addItem1(GroceryItem item, int num){
        item1=item;
        num1=num;
        item.stock = item.stock - num;
    }
    
    public void addItem2(GroceryItem item, int num){
        item2=item;
        num2=num;
        item.stock = item.stock - num;
    }    
    
    public void printReceipt(){
       double subTotal = item1.getCost() * num1 + item2.getCost() * num2;
        
       System.out.println("Shopper name: " + name);
       System.out.println("----------------------");
       System.out.println(item1.getName() + ": " + num1 + " units at $" + item1.getCost()+ " per unit = $" + 
       item1.getCost() * num1);
       System.out.println(item2.getName() + ": " + num2 + " units at $" + item2.getCost()+ " per unit = $" + 
       item2.getCost() * num2);
       System.out.println("   ----> Subtotal = $" + subTotal);
       System.out.println("   ----> 7% tax = $" + subTotal * .07);
       System.out.println("   ----> Total = $" + subTotal * 1.07);
       System.out.println();
       System.out.println();
    }
   
}
