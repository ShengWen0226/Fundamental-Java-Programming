import java.util.Random;

public class Ex2021_11_25 {

	public static void main(String[] args) {
		Ex2021_11_25 a = new Ex2021_11_25();
		//a.output((a.array(50,100)));
		//a.output(a.getMax(a.array(50,100)));
		a.output(a.array(4,3,10));
		a.output(a.getMax(a.array(4,3,10)));
	}
	
	public void output(int s) {
		System.out.println(s);
	}
	
	public void output(int[] s) {
		for(int i=0;i<s.length;i++)
			System.out.println((i+1)+")\s"+s[i]);
	}
	
	public void output(int[][] s) {
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.print(s[i][j]+"\s");
			}
			System.out.print("\n");
		}
	}
	
	public int[] array(int size,int max) {
		Random r=new Random();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
			array[i]=r.nextInt(max+1);
		return array;
	}
	
	public int[][] array(int size,int size2,int max) {
		Random r=new Random();
		int[][] array2D=new int[size][size2];
		for(int i=0;i<array2D.length;i++) {
			for(int j=0;j<array2D[0].length;j++)
				array2D[i][j]=r.nextInt(max+1);
		}
		return array2D ;
	}
	
	public int getMax(int[] array) {
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i])
				max=array[i];
		}
		return max;
	}
	
	public int getMax(int[][] array) {
		int max=0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++)
			if(max<array[i][j])
				max=array[i][j];
		}
		return max;
	}

}
