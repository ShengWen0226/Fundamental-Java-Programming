import java.util.Scanner;

public class HW2021_09_30 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		//�ݭnimport java.util.Scanner
		System.out.print("��J���:");
		int score;
		score=k.nextInt();
		System.out.println("----------");
		System.out.println("����:"+score);
		String grade="����:D";
		if(score<0||score>100) {
			grade="���ƿ��~";
		}else if(score>=80) {
			grade="����A";
		}else if(score>=70) {
			grade="����B";
		}else if(score>=60) {
			grade="����C";
		}
		System.out.println(grade);
		k.close();
		
	}

}
