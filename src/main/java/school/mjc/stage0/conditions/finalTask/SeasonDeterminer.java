package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer 

{
    public void tellTheSeason(int monthNumber) 
    
    {
        
                 if(month>=1 && month<=12)
        {
            
              if (month>=6 && month<=8)
        {
            System.out.println("Summer");
        }
              if (month>=9 && month<=11)
        {
            System.out.println("Fall");
        }
        
     
        
        if(month==12 || month==1 || month==2)
        {
            System.out.println("Winter");
        }
        
        if(month>=3 && month<=5)
        {
            System.out.println("Spring");
        }
        }       
                           
        else
        {
            System.out.println("Wrong month number");
        }

    }
}
