//6.4反序显示一个整数
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Please enter an integral: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		char[] mylist = new char[s.length()];
		for(int i = 0; i<s.length(); i++) {
			mylist[i] = s.charAt(i);
		}
		for(int i = mylist.length-1; i>=0; i--) {
			System.out.print(mylist[i]);
		}
	}
}


//6.17 显示n*n矩阵
import java.util.*;

public class PrintMatrix {
	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = input.nextInt();
		
		printMatrix(n);
		input.close();		
	}	
		public static void printMatrix(int n) {
	
		int printMatrix[][] = new int[n][n];
			for(int i = 0; i<printMatrix.length; i++) {
				for(int j = 0; j<printMatrix[i].length; j++) {
					printMatrix[i][j] = (int)(Math.random()*10)%2;
					System.out.print(printMatrix[i][j] + " ");
				}
			System.out.println();
			}
		}	
}


//7.7 统计随机整数出现的次数
import java.util.*;
public class CountNum {

	public static void main(String[] args) {
		
		int[] counts = new int[10];
		
		for(int i = 0; i < 100; i++) {
			int num = (int)(Math.random()*10);
			counts[num]++;
		}
		
		for(int i = 0; i < counts.length; i++) {
			System.out.println(i + "出现的次数为" + counts[i]);		
		}	
	}
}


//7.10 找出最小元素下标
import java.util.*;
public class SmallestElement {
	public static int indexOfSmallestElement(double[] array) {
		int n = 0;	
		for (int i = 0; i < array.length; i++) {
			double min = array[0];		
			if(array[i] < min) { 
				min = array[i];
				n = i;
			}
		}
		return n;	
	}				
	public static void main(String[] args) {
		
		double[] array = new double[10];
		
		System.out.print("Enter " + 10 + " values: ");
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i <= 9; i++) {
		
			array[i] = input.nextDouble();
		}		
		System.out.println("最小整数的下标为" + indexOfSmallestElement(array));		
		input.close();	
	}
}


//8.2 求矩阵主对角元素的和
import java.util.*;
public class MajorDiagonal {
		
	public static void main(String[] args) {
		
		double[][] m = new double[4][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for(int row = 0; row < 4; row++) {
			for(int column = 0; column < 4; column++) {
				m[row][column] = input.nextInt();
			System.out.print(m[row][column]+" ");
			}
		System.out.println();
		}					
		System.out.println("Sum of the elements in the major diagonal is" + sumMajorDiagonal(m));	
	}
	
public static double sumMajorDiagonal(double[][] m) {
	double sum = 0;
	sum = sum + m[0][0] + m[1][1] + m[2][2] + m[3][3];
	return sum;
}
}
