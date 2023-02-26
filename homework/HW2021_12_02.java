import java.util.Random;

public class HW2021_12_02 {

	static Random ra = new Random();

	public static void main(String[] args) {
		HW2021_12_02 h = new HW2021_12_02();
		double[] array = new double[50];
		int total = 20;
		double range = 100;
		h.generateOrderedValues(array, total, range);
		double b = Math.round(ra.nextDouble() * range * 10.0) / 10.0;
		System.out.println("\n" + "b=" + b);
		int loc = h.getPosition(array, b);
		System.out.println("b的位置=" + loc); 
		h.getNewArray(array, total, b, loc);
	}

	public int getPosition(double[] array, double b) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > b)
				return i;
		}
		return 20;
	}

	public void getNewArray(double[] array, int total, double b, int loc) {
		for (int i = total; i > loc; i--)
			array[i] = array[i - 1];
		array[loc] = b;
		System.out.print("插入b後:");
		for (int i = 0; i <= total; i++)
			System.out.print(array[i] + "\s\s");
	}

	public void generateOrderedValues(double[] array, int total, double range) {
		array[0] = Math.round(ra.nextDouble() * range / 1.5) / 10.0;
		for (int i = 1; i < total; i++)
			array[i] = Math.round(array[i - 1] * 10 + (ra.nextDouble() * range / 1.5)) / 10.0;
		System.out.print("原始陣列:");
		for (int i = 0; i < total; i++)
			System.out.print(array[i] + "\s\s");
	}

}
