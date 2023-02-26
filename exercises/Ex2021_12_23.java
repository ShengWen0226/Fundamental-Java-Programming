import java.util.Random;

public class Ex2021_12_23 {

	private Random ra = new Random();
	static int[][] a = new int[1][1];

	public static void main(String[] args) {
		Ex2021_12_23 h = new Ex2021_12_23();
		a = h.getRandomMatrix();
		System.out.println("原始矩陣");
		h.printArray(a);
		h.tramspose();
		System.out.println("轉置後");
		h.printArray(a);
		System.out.println("再轉置後");
		int[][] b = h.tramspose(a);
		h.printArray(b);
	}

	public int[][] tramspose(int[][] a) {
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
	}

	public void tramspose() {
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		a = b;
	}

	public int[][] getRandomMatrix() {
		int[][] array = new int[3][4];
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
