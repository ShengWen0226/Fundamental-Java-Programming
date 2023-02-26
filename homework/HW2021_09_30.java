import java.util.Scanner;

public class HW2021_09_30 {

	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		//惠璶import java.util.Scanner
		System.out.print("块俱计:");
		int score;
		score=k.nextInt();
		System.out.println("----------");
		System.out.println("だ计:"+score);
		String grade="单:D";
		if(score<0||score>100) {
			grade="だ计岿粇";
		}else if(score>=80) {
			grade="单A";
		}else if(score>=70) {
			grade="单B";
		}else if(score>=60) {
			grade="单C";
		}
		System.out.println(grade);
		k.close();
		
	}

}
