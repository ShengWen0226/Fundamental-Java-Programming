import java.util.Scanner;

public class HW2021_12_23 {

	private char[] letters = new char[26];
	private char[] codes = new char[26];
	private char[] sentence = new char[0];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW2021_12_23 hw = new HW2021_12_23();
		System.out.println("輸入文字:");
		hw.sentence = sc.nextLine().toCharArray();
		System.out.print("功能:加密(0)/解密(1)\s選擇:");
		int choose = sc.nextInt();
		System.out.print("輸入偏移量(1~25):");
		int n = sc.nextInt();
		sc.close();
		hw.fillLetters();
		hw.fillCodes(n);
		if (choose == 0)
			hw.encode();
		else if (choose == 1)
			hw.decode();
		System.out.println("-----------------");
		hw.print(hw.sentence);
	}

	public void encode() {
		for (int i = 0; i < sentence.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (sentence[i] == letters[j] || (int) sentence[i] == ((int) letters[j]) + 32) {
					sentence[i] = codes[j];
					break;
				}
			}
		}
	}

	public void decode() {
		for (int i = 0; i < sentence.length; i++) {
			for (int j = 0; j < codes.length; j++) {
				if (sentence[i] == codes[j]) {
					sentence[i] = letters[j];
					break;
				}
			}
		}
	}

	public void fillLetters() {
		for (int i = 0; i < letters.length; i++)
			letters[i] = (char) (i + 65);
	}

	public void fillCodes(int n) {
		for (int i = 0; i < codes.length; i++)
			codes[i] = (i >= n) ? (char) (i + 65 - n) : (char) (i + 91 - n);
		print(codes);
	}

	public void print(char[] c) {
		for (char i : c)
			System.out.print(i);
		System.out.print("\n");
	}

}
