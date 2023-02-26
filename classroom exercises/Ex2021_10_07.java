
public class Ex2021_10_07 {

	public static void main(String[] args) {
		int total=78,ten=0,five=0,one=0;
		for(int i=1;i<=4 && total>0;i++) {
			total-=10;
			ten++;
		}
		five=total/5;
		one=total%5;
		System.out.println("十元:"+ten+"個\n"+"五元:"+five+"個\n"+"壹元:"+one+"個");
				
	}

}
