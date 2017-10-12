
/**
 * Integration class to do numerical integration.
 */
public class Integration
{
    public static double numericallyIntegrate(double lb, double ub, int numRec)
    {
        double area = 0.0;
        
        //loop statement for every rectangle used in the clacualation
        for(int i = 0; i < numRec; i++){
            area += ((ub - lb)/numRec) * function((((ub - lb)/numRec)*(i+.5) + lb)) ;
        }
        // general formula for integration with rectangles    
        return area;
    }
    
    private static double function(double x)
    {
        return x * x;
    }
}