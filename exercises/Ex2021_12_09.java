import java.util.Random;

public class Ex2021_12_09 {

	static Ex2021_12_09 e = new Ex2021_12_09();
	Random ra = new Random();

	public static void main(String[] args) {
		double[] array = new double[20];
		e.generateOrderedValues(array,100);
		System.out.println("ензб:"+e.average(array));
		System.out.println("max:"+e.max(array));
	}
	
	public double max(double[] array) {
		double max=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}

	public double average(double[] array) {
		double sum = 0;
		for (double i : array)
			sum += i;
		return sum / array.length;
	}

	public void generateOrderedValues(double[] array, double range) {
		array[0] = Math.round(ra.nextDouble() * range / 1.5) / 10.0;
		for (int i = 1; i < array.length; i++)
			array[i] = Math.round(array[i - 1] * 10 + (ra.nextDouble() * range / 1.5)) / 10.0;
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "\n");
	}

	/*
	 * public double getY(double x) { return x * x * x; }
	 * 
	 * public double dF(double x, double dx) { double y1 = e.getY(x); double y2 =
	 * e.getY(x + dx); return (y2 - y1) / dx; }
	 * 
	 * public double integralF(double x0, double x1, double dx) { double y1, y2,
	 * area = 0; while (true) { if (x0 + dx > x1) return area; y1 = e.getY(x0); y2 =
	 * e.getY(x0 + dx); area += (y1 + y2) * dx / 2; x0 += dx; } }
	 */

}
