
public class HW2021_10_07 {

	public static void main(String[] args) {
	    long sum=0;
		for(int i=2;i<=9998;i+=2) 
			sum+=Math.pow(i,2);
		System.out.println(sum);
	}

}
