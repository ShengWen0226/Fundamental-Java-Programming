
public class HW2021_10_14 {

	public static void main(String[] args) {
		System.out.println(taylor(20,0.7));
	}
	public static double taylor(int n , double x) {
		if(n==1)
			return 1;
		else
			return n*Math.pow(x,n-1)+taylor(n-1,x);
	}

}
