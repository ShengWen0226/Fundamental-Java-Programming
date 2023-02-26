import java.util.Random;

public class HW2021_12_16 {

	private static Random ra = new Random();

	public static void main(String[] args) {
		HW2021_12_16 h = new HW2021_12_16();
		int[][] a = h.getRandomMatrix();
		System.out.println("原始陣列:");
		h.printArray(a);
		int b = ra.nextInt(11);
		System.out.println("常數b=" + b);
		int[][] c = h.scaleMatrix(a,b);
		System.out.println("a*b:");
		h.printArray(c);
	}

	public int[][] scaleMatrix(int[][] a, int b) {
		int[][] array = new int[a.length][a[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = a[i][j]*b;
		}
		return array;
	}

	public int[][] getRandomMatrix() {
		int[][] array = new int[10][15];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = ra.nextInt(10);
		}
		return array;
	}

	public void printArray(int[][] array) {
		for (int[] i : array) {
			for (int j : i)
				System.out.print(j + "\s");
			System.out.print("\n");
		}
	}

}
