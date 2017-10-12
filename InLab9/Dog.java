
public class Dog extends Mammal
{
    private String Breed;
    
    public Dog(String inName, String inBreed){
        name = inName;
        Breed = inBreed;
    }
    
     public void printInfo(){
        System.out.println("The Dog's name is " + name + " and it's a " + Breed);
    }
}
