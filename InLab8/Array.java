
public class Array
{
    int[] anArray;
    
    public Array(int numElements){
        anArray = new int[numElements];
        //new array, numElements in length
    }
    
    public void fill(){
        for(int i = 0; i < anArray.length; i++){
            anArray[i] = (int)(Math.random()*9);
            //assigns each slot in the array with a random number between 1-9
        }
    }
    
    public void print(){
        //formats the printing of the random numbers within the array
        for(int i = 0; i < anArray.length; i++){
            System.out.print("--");
        }
        System.out.print("-");
        System.out.println();
        
        for(int i = 0; i < anArray.length; i++){
            System.out.print("|" + anArray[i]);
        }
        System.out.print("|");
        System.out.println();
        
        for(int i = 0; i < anArray.length; i++){
            System.out.print("--");
        }
        System.out.print("-");
        System.out.println();
    }
    
    public void sort(){
        //sorts the array into numerical order, one pass at a time
        for(int i = 0; i < anArray.length; i++){
            
            for(int j = 0; j < anArray.length - 1; j++){
                int current = anArray[j];
                int next = anArray[j+1];
                
                if(current > next){
                    int temp = anArray[j];
                    
                    anArray[j] = anArray[j+1];
                    anArray[j+1] = temp;
                }
            }
        }    
    }
    
    public void printFrequency(){
        //Through numbers 1-9, counters how many times it occurs in the array
        int arrayCounter = 0;
        for(int i = 0; i < 10; i++){
            int counter = 0; 
            while(arrayCounter < anArray.length && i == anArray[arrayCounter]){
                counter++;
                arrayCounter++;
                
            }
            System.out.println("There are " + counter + ", " + i + "'s");
            //prints out the outcome of the counter
        }
    }
}
