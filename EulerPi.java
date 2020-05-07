
public class EulerPi {

	public static void main(String[] args) {
		
		double pi = 0.0;
		double num = 1.0;
	    
	    while(num<1000000)
	   
	    {
	        pi+=1.0/Math.pow(num,2.0);
	        num+=1.0;
	    }
	    
	    System.out.printf("pi = "+"%.10f",Math.sqrt(6*pi));

	}

}
