import lejos.hardware.Button;
import lejos.utility.Delay;


public class jarvis
{

	public static void main(String[] args)
	
	{
		viernes we = new viernes();
		traductor tr = new traductor();
		
       
		while(true)
        {
		   // double yo = tr.medir();
       
           if(tr.medir() > 0)
           {
    	      tr.traducir();
    	      
           }
           if(Button.readButtons() == 1)
     	  {
     		  System.out.println(tr.traducir());
     		   tr.escribir(".-.-. ..");
     	  }   	  
        
       
        }
		
		
		
		
     }
}
