import java.util.Scanner;
public class RalaFindIndex {
	
	public static void main(String args[]) {
		
		Other method = new Other();
		
		System.out.print("Enter Array length : ");
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		
		int[] arr = new int[l];
		arr=method.assignArray(arr);
		
		method.printArray(arr);
		
		System.out.print("Enter Value : ");
		int x=scan.nextInt();
		
		System.out.println("Index is : " + method.findIndex(arr, x));
		scan.close();
		
	}

}

class Other {
	
	Scanner sc = new Scanner(System.in);
	int[] assignArray(int[] a) {
		
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();
		
		return a;
	}
	void printArray(int[] a) {
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
	int findIndex(int[] a,int x) {
		for(int i=0; i<a.length; i++)
			if(a[i]==x)
				return i;
		return -1;
	}

	
}
