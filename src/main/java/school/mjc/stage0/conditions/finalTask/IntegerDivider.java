package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider 

{
    public void printCompletelyDivided(int dividend, int divider) 
    
    {
        
         if(divider !=0)
            
        {
        
        int x=dividend/divider;
        int y=x*divider;
        
      
        if (y==dividend)
        {
            System.out.println("can be divided completely");
        }
        else
        {
            System.out.println("cannot be divided completely");
        }
        }
        else
        {
            System.out.println("division by zero");
        }
    }
}
