package DsaLab6;

public class Lab6 {
	public static void main(String[] args) {

	int[] array = {3, 7, 1, 9, 4};
	int[] result = delete(array, 2);
	display(result);
	}
	public static void display(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static int[] delete(int[] array, int idx) {
		int[] newArray= new int[array.length-1];
			for (int i = 0, j = 0; i < array.length; i++) { 
				if (i != idx) { 
					newArray[j++] = array[i];
					} 
				}
			return newArray;
			
	}
}
