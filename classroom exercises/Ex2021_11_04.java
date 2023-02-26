
public class Ex2021_11_04 {

	public static void main(String[] args) {
		/*
		Random r=new Random();
		int[] a=new int[51];
		for(int i=0;i<=50;i++) {
			a[i]=r.nextInt(101);
			System.out.println(a[i]);
		}
		*/
		double dx=0.01,ext=0;
		int n=(int)(2/dx)+1;
		double[] x=new double[n+1];
		double[] y=new double[n];
		for(int i=0;i<=y.length-1;i++) {
			x[i+1]=Math.round(x[i]*100.0)/100.0+dx;
			y[i]=((x[i+1]*x[i+1]-x[i+1]+5)-(x[i]*x[i]-x[i]+5))/dx;
			System.out.println(x[i]+","+y[i]);
			if(Math.abs(y[i])<=1.e-2)
				ext=x[i];
		}
		System.out.println("ext:"+ext);

	}

}
