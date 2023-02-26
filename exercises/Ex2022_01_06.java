import java.util.Scanner;

public class Ex2022_01_06 {

	private static int[] nums = { 1, 2, 3, 4 };
	private static int[] a = null;
	private static int[] b = null;

	public static void main(String[] args) {
		Ex2022_01_06 e = new Ex2022_01_06();
		Scanner sc = new Scanner(System.in);
		System.out.println("1)n!\n2)fibonacci\n3)dx");
		System.out.print("choose:");
		int no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.print("n=");
			int max = sc.nextInt();
			System.out.println(max + "!=" + e.factorial(max));
			break;
		case 2:
			System.out.print("n=");
			int num = sc.nextInt();
			System.out.println(num + ")" + e.fibonacci(num));
			break;
		case 3:
			System.out.println("輸入係數:");
			String[] sa = sc.nextLine().split("\s");
			System.out.println("輸入次方數:");
			String[] sb = sc.nextLine().split("\s");
			System.out.print("X=");
			int x = sc.nextInt();
			for (int i = 0; i < sa.length; i++) {
				a[i] = Integer.parseInt(sa[i]);
				b[i] = Integer.parseInt(sb[i]);
			}
			System.out.println("y=" + e.dx(x));
			break;
		case 4:

			break;
		case 5:
			e.permutations(0, nums.length);
			break;
		default:
			System.out.println("掰掰");
			break;
		}
		sc.close();
	}

	public int dx(int x) {
		int y = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] *= b[i];
			b[i]--;
			y += a[i] * Math.pow(x, b[i]);
		}
		return y;
	}

	public long fibonacci(int a) {
		if (a == 1 || a == 2)
			return 1;
		else
			return fibonacci(a - 1) + fibonacci(a - 2);
	}

	public long factorial(int a) {
		if (a <= 1)
			return 1;
		else
			return a * factorial(a - 1);
	}

	public void change(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void permutations(int num, int len) {
		if (num == len - 1) {
			for (int i : nums)
				System.out.print(i);
			System.out.print("\n");
		} else {
			for (int j = num; j < len; j++) {
				change(num, j);
				permutations(num + 1, len);
				change(num, j);
			}
		}
	}

}
