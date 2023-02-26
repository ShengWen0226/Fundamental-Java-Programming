import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HW2021_12_30 {

	public static void main(String[] args) {
		String[] p = new String[400];
		try {
			BufferedReader br = new BufferedReader(new FileReader("D://points.dat"));
			String s = null;
			for (int n = 0; (s = br.readLine()) != null; n++)
				p[n] = s;
			br.close();
			PrintWriter pw = new PrintWriter(new FileWriter("D://Points_2.txt"));
			for (int i = 0; i < p.length; i += 2)
				pw.println(p[i] + "," + p[i + 1]);
			pw.close();
		} catch (Exception e) {

		}
	}

}
