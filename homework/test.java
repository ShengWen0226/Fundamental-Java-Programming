
public class test {

	private static int[] nums = { 1, 2, 3, 4 };

	public static void main(String[] args) {
		test t = new test();
		t.permutations(0, nums.length);
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
