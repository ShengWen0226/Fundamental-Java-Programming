import java.util.Random;

public class Ex2021_12_02 {

	public static void main(String[] args) {
		Ex2021_12_02 e = new Ex2021_12_02();
		double r = 1;
		System.out.println(e.getPI(r));
		int[] array = new int[10];
		e.setArray(array);
		for(int a:array)
			System.out.print(a+"\s");
		System.out.println();
		e.insert(array, 30);
	}

	public double getPI(double r) {
		double x, y, point = 0, i = 1;
		Random ra = new Random();
		while (i <= 1000000000) {
			x = ra.nextDouble() * r;
			y = ra.nextDouble() * r;
			if (Math.sqrt((x * x) + (y * y)) <= r) {
				point++;
			}
			i++;
		}
		return 4 * (point / i) / (r * r);
	}
	public void setArray(int[] array) {
		Random ra = new Random();
		array[0]=ra.nextInt(10);
		for(int i=1;i<array.length;i++) {
			array[i]=array[i-1]+ra.nextInt(10);
		}
	}
	
	public void insert(int[] array, int b) {
		int[] array2 = new int[11];
		array2[10]=b;
		int a;
		for(int i=0;i<array.length;i++) {
			array2[i]=array[i];
		}
		for (int i = 10; i > 0; i--) {
			if (array2[i] < array2[i-1]) {
				a=array2[i-1];
				array2[i-1]=array2[i];
				array2[i]=a;
			}
		}
		for(int c:array2)
			System.out.print(c+"\s");
	}

}
