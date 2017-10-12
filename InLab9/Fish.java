
public class Fish extends Pet
{
    private String color;
    
    public Fish(String inColor){
        super("swimmy");
        color = inColor;
    }
     
    public void printInfo(){
        System.out.println("The fish is " + color + " and it's name is " + name);
    }
}
