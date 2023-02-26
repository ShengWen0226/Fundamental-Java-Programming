import java.util.Random;

public class Ex2021_12_30 {
	Random ra = new Random();

	public static void main(String[] args) {
		Ex2021_12_30 e = new Ex2021_12_30();
		int[][] a = e.getRandomMatrix(2, 3);
		e.printMatrix(a);
		int[][] b = e.getRandomMatrix(3, 2);
		e.printMatrix(b);
		int[][] c = e.matrixMultiply(a, b);
		e.printMatrix(c);
		int[] d = e.getRandomMatrix(10);
		e.printMatrix(d);
		int[] d2 = e.bubble(d);
		e.printMatrix(d2);
	}

	public int[] bubble(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		return a;
	}

	public int[][] matrixMultiply(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < b.length; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		return c;
	}

	public int[] getRandomMatrix(int columns) {
		int[] array = new int[columns];
		for (int i = 0; i < array.length; i++)
			array[i] = ra.nextInt(10);
		return array;
	}

	public int[][] getRandomMatrix(int rows, int columns) {
		int[][] array = new int[rows][columns];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = ra.nextInt(10);
		}
		return array;
	}

	public void printMatrix(int[] a) {
		for (int i : a)
			System.out.print(i + "\s");
		System.out.print("\n");
		System.out.println("---------------------");
	}

	public void printMatrix(int[][] a) {
		for (int i[] : a) {
			for (int j : i)
				System.out.print(j + "\s");
			System.out.print("\n");
		}
		System.out.println("---------------------");
	}

}

