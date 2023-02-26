//package s108;

import java.util.Random;
import java.util.Scanner;

class Java110_finalexam {
	private double[] x5 = { 0, 2, 3 };
	private double[] y5 = { 0, 3, 5 };

	public static void main(String args[]) {
		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		Java110_finalexam f = new Java110_finalexam();
		while (true) {
			System.out.println("0) exit");
			System.out.println("1) arithmetic operation");
			System.out.println("2) find intersections of a line and a circle");
			System.out.println("3) Count even integers in an array");
			System.out.println("4) shift every digit of an integer by one digit right");
			System.out.println("5) Bazier curve");
			System.out.println("6) Gaussian Elimination");
			System.out.println();
			System.out.println("please select a function by input a number 0~6?");
			int no = sc.nextInt();
			if (no == 0)
				break; // end of the while loop
			switch (no) {
			case 1:
				/**********************************************************************
				 * put your codes to solve the problem 1
				 **********************************************************************/
				System.out.println("what is the first value?");
				double a1 = sc.nextDouble();
				System.out.println("what is the operator? +, -, * or /?");
				char op = sc.next().charAt(0);
				System.out.println("what is the 2nd value?");
				double b1 = sc.nextDouble();
				System.out.println(a1 + "" + op + "" + b1 + "=" + f.arithmetic(a1, op, b1));
				break;
			case 2:
				/**********************************************************************
				 * put your codes to solve the problem 2
				 **********************************************************************/
				f.findIntersections();
				break;
			case 3:
				/**********************************************************************
				 * put your codes to solve the problem 3
				 **********************************************************************/
				int[] array3 = new int[50];
				for (int i = 0; i < array3.length; i++)
					array3[i] = ra.nextInt(1001);
				int ans3 = f.countEvenIntegers(array3);
				System.out.println("ans=" + ans3);
				break;
			case 4:
				/**********************************************************************
				 * put your codes to solve the problem 4
				 **********************************************************************/
				System.out.println("How many digits does your number have?");
				int n3 = sc.nextInt();
				int[] no3 = new int[n3];
				for (int i = 0; i < no3.length; i++) {
					System.out.println("input your number one digit by one digit from left to right!");
					System.out.println("digit " + (i + 1) + "?");
					no3[i] = sc.nextInt();
				}
				long ans4 = f.shiftRight(no3);
				System.out.println("ans=" + ans4);
				break;
			case 5:
				/**********************************************************************
				 * put your codes to solve the problem 5
				 **********************************************************************/
				System.out.println("please input the parameter t? (0 <= t <= 1)");
				double t = sc.nextDouble();
				double[] ans5 = f.getBazier(t);
				System.out.println("ans=" + ans5[0] + "," + ans5[1]);
				break;
			case 6:
				/**********************************************************************
				 * put your codes to solve the problem 6
				 **********************************************************************/
				double[][] n6 = { { 2, 1, 2, 1 }, { 0, -9, 0, 9 }, { 0, 1, -1, -5 }, { 0, 1, -3, 0 } };
				double[] c6 = { 6, 18, -13, 4 };
				double[][] array6 = new double[n6.length][n6[0].length + 1];
				for (int i = 0; i < n6.length; i++) {
					for (int j = 0; j < n6[0].length; j++) {
						array6[i][j] = n6[i][j];
					}
					array6[i][array6[0].length - 1] = c6[i];
				}
				System.out.println("-----------------------------");
				f.printArray(array6);
				f.GEliminate(array6);
				System.out.println("-----------------------------");
				f.printArray(array6);
				System.out.println("-----------------------------");
				System.out.println("ans:");
				for (int i = 0; i < array6.length; i++)
					System.out.println("X" + (i + 1) + "=" + array6[i][4]);
				break;
			}

		}
		sc.close();

	}
	/**********************************************************************
	 * 1) do arithmetic operation
	 **********************************************************************/
	public double arithmetic(double a, char operator, double b) {
		if (operator == '+')
			return a + b;
		else if (operator == '-')
			return a - b;
		else if (operator == '*')
			return a * b;
		else
			return a / b;
	}
	/**********************************************************************
	 * 2) find intersections of a line and a circle, and then directly output them
	 * in here
	 **********************************************************************/
	public void findIntersections() {
		double dx = 0.001, x = -7, y;
		int n = (int) (7 / dx);
		for (int i = 0; i <= n; i++) {
			y = x + 7;
			if (Math.abs(x * x + y * y - 25) <= 1.e-6)
				System.out.println(x + "," + y);
			x = Math.round((x + dx) * 100000.0) / 100000.0;
		}
	}
	/**********************************************************************************
	 * 3) count the number of total even integers in an integer array
	 **********************************************************************************/
	public int countEvenIntegers(int[] a) {
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ans++;
				System.out.println(a[i]);
			}
		}
		return ans;
	}
	/**********************************************************************
	 * 4) please develop your method here and do matrix multiplication
	 **********************************************************************/
	public long shiftRight(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length - 1; i++)
			ans += a[i] * Math.pow(10, a.length - 2 - i);
		ans += a[a.length - 1] * Math.pow(10, a.length - 1);
		return ans;
	}
	/**********************************************************************
	 * 5) Bazier curve
	 **********************************************************************/
	public double[] getBazier(double t) {
		double[] ans = new double[2];
		ans[0] = (1 - t) * (1 - t) * x5[0] + 2 * t * (1 - t) * x5[1] + t * t * x5[2];
		ans[1] = (1 - t) * (1 - t) * y5[0] + 2 * t * (1 - t) * y5[1] + t * t * y5[2];
		return ans;
	}
	/**********************************************************************
	 * 6) Gaussian Elimination
	 **********************************************************************/
	public void GEliminate(double[][] s) {
		for (int a = 0; a < s[0].length; a++)
			s[3][a] = s[2][a] - s[3][a];
		for (int a = 0; a < s[0].length; a++)
			s[1][a] = s[2][a] * (-9) - s[1][a];
		for (int a = 0; a < s[0].length; a++)
			s[1][a] = s[1][a] - s[3][a] * 9 / 2;
		s[1][4] = s[1][4] / s[1][3];
		s[1][3] = 1;
		for (int a = 0; a < s[0].length; a++)
			s[3][a] = s[3][a] + s[1][a] * 5;
		s[3][4] = s[3][4] / s[3][2];
		s[3][2] = 1;
		for (int a = 0; a < s[0].length; a++)
			s[2][a] = s[2][a] + s[1][a] * 5 + s[3][a];
		for (int a = 0; a < s[0].length; a++)
			s[0][a] = s[0][a] - s[1][a] - s[2][a] - s[3][a] * 2;
		s[0][4] = s[0][4] / s[0][0];
		s[0][0] = 1;
		s[1][0] = 0;
		double[] n = s[1];
		s[1] = s[2];
		s[2] = s[3];
		s[3] = n;
	}
	public void printArray(double[][] a) {
		for (double[] i : a) {
			for (double j : i)
				System.out.print(j + "\s\s");
			System.out.println();
		}
	}

}
