/**
 * Driver for Inlab9.
 */
public class Driver
{
    public static void main(String[] args)
    {
        Pet p = new Pet("Terrance");
        p.printInfo();
        System.out.println();
        
        Mammal m = new Mammal();
        m.printInfo();
        m.setName("Roxie");
        m.printInfo();
        System.out.println();
        
        Fish f = new Fish("red");
        f.printInfo();
        f.setName("Shark");
        f.printInfo();
        System.out.println();
        
        Dog d = new Dog("Watson", "Basset");
        d.printInfo();
    }
}