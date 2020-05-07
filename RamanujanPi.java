
public class RamanujanPi {

	public static void main(String[] args) {
		
		int k=30;
		double term = 0;
		double sum = 0;
		
		for (int i = 0; i < k; i++) 
		{
			term = (double)((4*i)*(1103+(26390*i)))/(4)*Math.pow(396, (4*i));
		    sum += term;
		}
		sum *= ((2*Math.sqrt(2))/9801);
		sum = Math.pow(sum, -1);
		System.out.println(sum);
	}
}


