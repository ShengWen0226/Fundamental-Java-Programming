import java.util.Random;

public class Ex2021_12_16 {

	private Random ra = new Random();
	static int sum=0;

	public static void main(String[] args) {
		Ex2021_12_16 h = new Ex2021_12_16();
		int row=2,columns=3;
		int[][] Aarray = new int[row][columns];
		Aarray=h.getRandomMatrix(row,columns);
		System.out.println("°}¦Ca:");
		h.printArray(Aarray);
		int[][] Barray = new int[row][columns];
		Barray=h.getRandomMatrix(row,columns);
		System.out.println("°}¦Cb:");
		h.printArray(Barray);
		int[][] Carray = new int[row][columns];
		Carray=h.getSum(Aarray,Barray);
		System.out.println("°}¦Ca+b:");
		h.printArray(Carray);
		h.getAllSum(Aarray,Barray);
		System.out.println("sum="+sum);
		/*
		double[] array = new double[50];
		int total = 20;
		double range = 100;
		h.generateOrderedValues(array, total, range);
		System.out.print("­ì©l°}¦C:");
		h.printArray(array);
		double b = Math.round(ra.nextDouble() * range * 10.0) / 10.0;
		System.out.println("\n" + "b=" + b);
		int loc = h.getPosition(array, b);
		System.out.println("bªº¦ì¸m=" + loc);
		h.getNewArray(array, total, b, loc);
		System.out.print("·s°}¦C:");
		h.printArray(array);
		*/
	}

	public void getAllSum(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				sum += a[i][j] + b[i][j];
		}
	}

	public int[][] getSum(int[][] a, int[][] b) {
		int[][] Carray = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				Carray[i][j] = a[i][j] + b[i][j];
		}
		return Carray;
	}

	public int[][] getRandomMatrix(int rows, int columns) {
		int[][] array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				array[i][j] = ra.nextInt(10);
		}
		return array;
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
	}

	public void generateOrderedValues(double[] array, int total, double range) {
		array[0] = Math.round(ra.nextDouble() * range / 1.5) / 10.0;
		for (int i = 1; i < total; i++)
			array[i] = Math.round(array[i - 1] * 10 + (ra.nextDouble() * range / 1.5)) / 10.0;
	}

	public void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				break;
			System.out.print(array[i] + "\s\s");
		}
	}
	public void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for(int j=0;j<array[0].length;j++)
				System.out.print(array[i][j] + "\s\s");
			System.out.print("\n");
		}
	}

}
