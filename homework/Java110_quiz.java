

public class Java110_quiz {
	
	/****************************************************************************
	 * your student ID: 00951008
	 ****************************************************************************/	
	
	public static void main(String args[]){
		
	/****************************************************************************
	 * problem 1
	 ****************************************************************************/
		System.out.println("problem 1:");
		for(int i=1;i<=9;i++) {
			if(i!=5)
				System.out.println("*  *");
			else
				System.out.println("****");
		}
		System.out.print("\n");
	/****************************************************************************
	 * problem 2
	 ****************************************************************************/
		int a2=70,sum=0,day=0;
		while(sum<2500) {
			sum+=a2;
			day+=1;
			if(day%7==0)
				sum-=60;
		}
		System.out.println("problem 2: \n"+day+" day");
		System.out.print("\n");
	/****************************************************************************
	 * problem 3
	 ****************************************************************************/
		double dx=0.02,x=0,y=0,area=0;
		int n=(int)(2/dx);
		for(int i=0;i<=n;i++) {
			y=Math.atan(x);
			if(i!=0 && i!=n) {
				if(i%2==0) {
					y=2*y;
				}else {
					y=4*y;
				}
			}
			area+=y;
			x=Math.round((x+dx)*100)/100.0;
		}
		area=area*dx/3;
		System.out.println("problem 3: \n"+"area= "+area);
		System.out.print("\n");
	/****************************************************************************
	 * problem 4
	 ****************************************************************************/
		int a4=1,b4=1,c4=0,y4=0;
		for(int i=1;i<=19;i++) {
			y4+=a4*b4;
			c4=b4;
			b4+=a4;
			a4=c4;
		}
		System.out.println("problem 4: \n"+"y= "+y4);
		System.out.print("\n");
	/****************************************************************************
	 * problem 5
	 ****************************************************************************/
		System.out.println("problem 5:");
		int s5;
		for(int i=101;i<=999;i++) {
			s5=(int)(Math.pow(i/100,3)+Math.pow(i%100/10,3)+Math.pow(i%10,3));
			if(s5==i) {
				System.out.println(s5);
			}
		}
	}

}
