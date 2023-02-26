
public class HW2021_10_21 {

	public static void main(String[] args) {
		double x=Math.PI/4,i=x,sum=x,ans=Math.sin(x);
		for(int n=3;n<=41;n+=2) {
			i=i*(-1)*Math.pow(x,2)/(n*(n-1));
			sum+=i;
		}
		System.out.println("sin(£k/4)="+ans);
		System.out.println("Taylor="+sum);
		System.out.println("»~®t="+(ans-sum));
	}
}
