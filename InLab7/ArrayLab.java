
/**
 * Write a description of class ArrayLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayLab
{
    int[] values;
    
    public ArrayLab(int numElements){
        values = new int[numElements];
    }
    
    public void initialize(){
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(Math.random()*10+1);
        }     
    }
    
    public void print(){
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i] + ",");
        }
        
        System.out.println();
        System.out.println();
    }
    
    public void printStats(){
        int max = -1;
        int min = 11;
        double avg = 0;
        
        for(int i = 0; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
            
            if(values[i] < min){
                min = values[i];
            }
        
            avg += values[i];
        }
        
        System.out.println("Average Value: " + avg/values.length);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
    
    public void search(int num){
        boolean isFound = false;
        
        for(int i = 0; i < values.length; i++){
            if(values[i] == num){
                isFound = true;
            }
        }
        
        if(isFound == false){
            System.out.println(num + " was not found.");
        }
        else 
        System.out.println(num + " was found.");
    }
    
    
    }
}
