
public class LifenitzPi {

	public static void main(String[] args) {

		double pi=0;
		int mother, a=100000;
		double sign=1.0;
		
		
			
			for(mother=1; mother<a; mother+=2) {
				
				pi+=(1.0/mother)*sign;
				sign=-sign;
			}
			pi=pi*4;
			System.out.println("pi = "+pi);
			
		pi=0f;
		
		
	}

}
