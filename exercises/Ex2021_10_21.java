
public class Ex2021_10_21 {

	public static void main(String[] args) {
		double x=Math.PI/4,sum=x,i=x,j=3;
		for(int n=1;n<=20;n++) {
			i=i*(-1)*x*x/(j*(j-1));
			sum+=i;
			j+=2;
		}
		System.out.println(sum);
		System.out.println(Math.sin(x));
		
	}

}
