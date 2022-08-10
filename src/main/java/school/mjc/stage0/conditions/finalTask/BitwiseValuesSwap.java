package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap 

{
    public void swap(int a, int b) 
    
    {
         a = a ^ b;  
       
        b = a ^ b;  

        a = a ^ b;  


       System.out.println(a + \n  +b);             
       
        
    }
}
