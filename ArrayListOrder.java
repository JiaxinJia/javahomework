import java.util.*;

public class ArrayListOrder {
	public static void sort(ArrayList<Number> list) {
		int length = list.size();
		double b[] = new double[length]; 
		for (int i = 0; i < list.size(); i++)
			b[i] = list.get(i).doubleValue();
		Arrays.sort(b);
		System.out.println(b);
	}
}
