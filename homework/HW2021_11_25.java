
public class HW2021_11_25 {

	public static void main(String[] args) {
		HW2021_11_25 hw = new HW2021_11_25();
		hw.output((hw.fibonacci(20)));
	}
	
	public void output(long[] a) {
		long sum=0;
		for(int i=0;i<a.length-1;i++)
			sum+=a[i]*a[i+1];
		System.out.println(sum);
	}
	
	public long[] fibonacci(int size) {
		long[] array = new long[size];
		array[0]=1;
		array[1]=1;
		for(int i=2;i<array.length;i++)
			array[i]=array[i-1]+array[i-2];
		return array;
	}

}
