import java.io.*;

public class CountPi {

	public static void main(String[] args) {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		
		double pi=0;
		int mother, a=100000;
		double sign=1.0;
		
			
			System.out.println("계산할 횟수를 입력하세요 :");
			
		try {
			String str = b.readLine();
			a=Integer.parseInt(str);
			
			for(mother=1;mother<a;mother+=2) {
				pi+=(1.0/mother)*sign;
				sign=-sign;
			}
		pi=pi*4;
				System.out.println("pi= "+pi);
		
		}
		catch(java.io.IOException e) {
			System.out.println("Input Error");
		}
		pi=0f;
		
		
	}

}
