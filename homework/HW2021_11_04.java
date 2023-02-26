import java.util.Random;

public class HW2021_11_04 {

	public static void main(String[] args) {
		Random r=new Random();
		int max=0,min=100;
		int[] a=new int[50];
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt(101);
			System.out.println((i+1)+")\s"+a[i]);
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("-------");
		System.out.println("max:"+max+"\nmin:"+min);

	}

}
