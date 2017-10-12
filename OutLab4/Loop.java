
/**
 * Write a description of class Loop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loop
{
    public Loop(){
    }
   
    public static void loop1(int lb,int ub, int incr){
        System.out.println("Loop 1 output (lb = " + lb + ", ub = " + ub + ", incr = " + incr + ")");
        
        for(int i = lb; i <= ub; i += incr){
            System.out.println(i);
        }
        
        //prints out 1-10 (lower bound to upper bound)
        System.out.println("-----------------------------");
    }
    
    public static void loop2(int lb, int ub, int incr){
        System.out.println("Loop 2 output (lb = " + lb + ", ub = " + ub + ", incr = " + incr + ")");
        
        int i = lb;
        while(i <= ub){
           System.out.println(i);
           i += incr;
        }
        
        //Prints out 1-10 (lower bound to upper bound), but using a while loop
        System.out.println("-----------------------------");
    }
    
    public static void loop3(){
        System.out.println("Loop 3 output:");
        
        char letter = 'a';
        
        for(int i = 1; i < 27; i++){
            
            for(int j = 0; j < i; j++){
                System.out.print((char)(letter + j));
            }
            System.out.println();
        }
        
        //Prints out the alpabet one letter at time until the full alphabet is printed
        System.out.println("-----------------------------");
    }
    
    public static void loop4(int val){
        System.out.println("Loop 4 Output:");
        
        int count = 0;
        for(int i = 0; i < 10; i++){
            int randomNum =(int)(Math.random()*10+1);
            
            if (randomNum == val){
                count++;
            }
                
        }
        
        //genereates a random number between 1-10 and counts how many times a certain number is generated
        System.out.println(val + " was found " + count + " times.");
        System.out.println("-----------------------------");
    }
    
    public static void loop5(int val){
        System.out.println("Loop 5 Output:");
        
        int i = 0;
        int count = 0;
        while(i < 5){
            int randomNum =(int)(Math.random()*10+1);
            
            if (randomNum == val){
                i++;
            }
            count++;
        }
        
        //Generates a random number between 1-10 and counts how many times it takes to get the input number five seperate times
        System.out.println("It took " + count + " iterations to generate " + val + " five times.");
        System.out.println("-----------------------------");
    }
}
