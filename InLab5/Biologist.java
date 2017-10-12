//Biologist Class
public class Biologist
{
    public static void identifyAnimal(Animal a){
        switch (a.getNumLegs()){
            case 0: 
                System.out.println("No legs");
                switch (a.getEnvironment()){
                    case "water": 
                        System.out.println("Lives in the water");
                        System.out.println("---> It's probably a fish.");  
                        break;
                    case "land": 
                        System.out.println("Lives on Land");
                        System.out.println("---> Sounds like a snake.");
                        break;
                    case "air":
                        System.out.println("Lives in the air");
                        System.out.println("---> I don't know, it sounds fake.");
                        break;
                } 
                break;
            case 2: 
                System.out.println("Two Legs");
                switch (a.getEnvironment()){
                    case "land":
                        System.out.println("Lives on land");
                        if (a.getSeemsNice()){
                            System.out.println("Seems nice");
                            System.out.println("---> Bro, that's your classmate.");
                        }
                        else {
                            System.out.println("Doesn't seem nice");
                            System.out.println("---> Bigfoot.  Take a picture.");
                        }
                        break;
                    case "air":
                        System.out.println("Lives in the air");
                        System.out.println("---> Easy one:  Bird.");
                        break;
                }
                break;
            case 4:
                System.out.println("Four Legs");
                 if (a.getSeemsNice()){
                    System.out.println("Seems nice");
                    System.out.println("---> Probably a dog.");
                }
                else {
                    System.out.println("Doesn't seem nice");
                    System.out.println("---> Skunk.  Watch out!");
                }
                break;
            default:
                System.out.println("That's an odd number of legs.  It's probably hurt or crawly.");
        }
            
    }
    
    public static void petOrNot(Animal a){
        if(a.getSeemsNice() && a.getNumLegs() == 4){
            System.out.println("Sure, pet it\n");
        }
        else if(!a.getSeemsNice() || a.getNumLegs() == 0){
            System.out.println("Don't pet it\n");
        }
        else {
            System.out.println("Pet at your own risk\n");
        }
    }
}
