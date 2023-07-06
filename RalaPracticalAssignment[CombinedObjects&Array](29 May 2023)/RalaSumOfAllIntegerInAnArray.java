import java.util.Scanner;
public class RalaSumOfAllIntegerInAnArray {
	
	int[] assignArray(int[] a) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
			a[i]=scan.nextInt();
		return a;
	}
	void printArray(int[] a) {
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
	int sumArray(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		return sum;
	}


public static void main(String args[]) {
	
	RalaSumOfAllIntegerInAnArray b= new RalaSumOfAllIntegerInAnArray();
		
	System.out.print("Enter Elements Length : ");
	Scanner scan = new Scanner(System.in);
	int l=scan.nextInt();
	
	int[] arr=new int[l];
	System.out.print("Enter Elements : ");
	arr=b.assignArray(arr);

	System.out.print("Your Array : ");
	b.printArray(arr);
	
	System.out.println("Sum of elements is : " + b.sumArray(arr));
	
	}
}