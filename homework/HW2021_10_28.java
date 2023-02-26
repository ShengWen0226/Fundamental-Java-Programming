
public class HW2021_10_28 {

	public static void main(String[] args) {
		double dx=0.01,n=Math.PI*2/dx;
		double[] x=new double[(int)n+2];
		double[] y=new double[(int)n+1];
		for(int i=0;i<n;i++) {
			x[i+1]=Math.round((x[i]+dx)*100)/100.0;
			y[i]=(Math.sin(x[i+1])-Math.sin(x[i]))/dx;
			System.out.println(x[i]+","+y[i]);
		}

	}

}
