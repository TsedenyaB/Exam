package DsaLab5;

public class Lab5 {
	
	

	
	public void mergeSort(int[] array) {
		if(array.length == 0) {
			return;
		}
		
		int mid = array.length/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[array.length - mid];
		
		for(int i = 0; i<mid; i++) {
			leftArray[i] = array[i];
		}
		
		for(int i = mid; i<array.length; i++) {
			rightArray[i-mid]= array[i];
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
	
	  merge(array, leftArray, rightArray);
		
	}
	public void merge(int[] array, int[] leftArray, int[] rightArray) {
		int leftL = leftArray.length;
		int rightL = rightArray.length;
		int i = 0; 
		int j= 0; 
		int k= 0;
		while(i <= leftL && j<=rightL) {
			if(leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			}
			else {
				array[k++] = rightArray[j++];
			}
		}
		
		while(i<leftL) {
			array[k++] = leftArray[i++];
		}
		while(j<rightL) {
			array[k++] = rightArray[j++];
		}
	}
	
}
