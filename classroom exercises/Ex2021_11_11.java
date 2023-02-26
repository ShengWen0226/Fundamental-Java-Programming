import java.util.Arrays;
import java.util.Random;

public class Ex2021_11_11 {

	public static void main(String[] args) {
		/*
		double dx=0.001,x=0,y=0;
		int n=(int)(2./dx)+1;
		double[][] point=new double[2][n];
		for(int i=0;i<point[0].length;i++) {
			point[0][i]=x;
			for(int j=1;j<=1000;j++) {
				y+=Math.sin((2*j-1)*point[0][i]*2*Math.PI)/(2*j-1);
			}
			point[1][i]=y*4/Math.PI;
			y=0;
			x+=dx;
			System.out.println(point[0][i]+","+point[1][i]);
		}
		*/
		
		Random r=new Random();
		int[][] a=new int[4][3];
		int[][] b=new int[4][3];
		int[][] c=new int[4][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=r.nextInt(10);
				b[i][j]=r.nextInt(10);
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
		System.out.println(Arrays.deepToString(c));

	}

}
