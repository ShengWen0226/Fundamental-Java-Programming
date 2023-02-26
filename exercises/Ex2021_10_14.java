import java.util.Scanner;

public class Ex2021_10_14 {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		*/
		Scanner k = new Scanner(System.in);
		System.out.print("n=");
		int a=k.nextInt();
		System.out.println(a+"!="+s(a));
		k.close();
	}
	public static int s (int a) {
		if(a==1) {
			return 1;
		}else
			return a*s(a-1);
	}

	
}
