import java.util.Random;

public class HW2021_11_11 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] before = new int[4][3];
		int[][] after = new int[before[0].length][before.length];
		System.out.println("before:");
		for(int i=0;i<before.length;i++) {
			for(int j=0;j<before[0].length;j++) {
				before[i][j] = r.nextInt(10);
				after[j][i] = before[i][j];
				System.out.print(before[i][j]+"\s");
			}
			System.out.print("\n");
		}
		System.out.println("after:");
		for(int k=0;k<after.length;k++) {
			for(int n=0;n<after[0].length;n++) {
				System.out.print(after[k][n]+"\s");
			}
			System.out.print("\n");
		}
	}

}
