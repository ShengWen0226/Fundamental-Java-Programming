
public class Ex2021_10_28 {

	public static void main(String[] args) {
		/*
		double dx=0.01,area=0,y1,y2,n=4/0.01,x=0;
		for(int i=1;i<=n;i++) {
			y1=2*x*x-3*x+7;
			x+=dx;
			y2=2*x*x-3*x+7;
			area+=(y1+y2)*dx/2;
		}
		System.out.println(area);
		
		x=0;
		double y;
		for(int i=1;i<=n;i++) {
			y1=2*x*x-3*x+7;
			x+=dx;
			y2=2*x*x-3*x+7;
			y=(y2-y1)/dx;
			System.out.println((x-dx)+","+y);
		}
		
		long[] array=new long[50];
		long a=1,b=1;
		for(int i=0;i<25;i++) {
			array[i]=a;
			array[i+1]=b;
			a+=b;
			b+=a;
			System.out.println(array[i]+"\n"+array[i+1]);
		}
		*/
		double sum=0,x=Math.PI/4;
		for(int n=0;n<=20;n++) {
			sum+=count(2*n)/Math.pow(4,n)/Math.pow(count(n),2)/(2*n+1)*Math.pow(x,2*n+1);
		}
		System.out.println(sum);
		System.out.println(Math.asin(x));
	}
	public static double count(double a) {
		if(a==0)
			return 1;
		else
			return a*count(a-1);
	}

}
