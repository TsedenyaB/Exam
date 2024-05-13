package DsaLab;
import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int elements = sc.nextInt();
		int[] array = new int[elements];
		System.out.println();
		
		for(int i = 0; i<array.length; i++) {
			System.out.print("Enter the Elements: ");
			array[i] = sc.nextInt();
			
		}
		 System.out.println();
		 display(array);
		 
		 System.out.print("Enter the number to search: ");
		 int numToSearch = sc.nextInt();
		 
		 int result = search(array, numToSearch);
		 System.out.println(result);
			
		
	}
	public static void display(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	
	public static int search(int[] array, int value) {
		int count = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i] == value) {
				count++;
			}
		
	 }
		return count;
	}

}
