
public class JohnPi {

	public static void main(String[] args) {
		
	
		 
		
		
		    double pi=1,even=2.0,odd=1.0;
		    int num=1;
		    
		    while(num<10000000)
		    {
		        pi*=even/odd;
		        if(num%2==1) odd+=2;
		        else even+=2;
		        num++;
		    }
		    
		   System.out.printf("%.10f",2.0*pi);
		

	}

}
