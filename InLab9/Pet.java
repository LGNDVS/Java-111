
/**
 * Pet Class
 */
public class Pet
{
    protected String name;
    
    public Pet(String inName){
        name = inName;
    }
    
    public void setName(String inName){
        name = inName;
    }
    
    public void printInfo(){
        System.out.println("The pet's name is " + name);
    }
}

