package DsaLab4;

public class Lab4 {
	public static void main(String[] args) {
		
		System.out.println(bubbleSort("ASKII"));
	}
	
	
	public static String bubbleSort(String word) {
		boolean isSwapped = false;
		int n = word.length();
		char[] chars = word.toCharArray();
		
		for(int i = 0; i<n-1; i++) {
			isSwapped = false;
			for(int j = 0; j<n-i-1; j++) {
				if(chars[j] > chars[j+1]) {
				    char temp  = chars[j];
				    chars[j] = chars[j+1];
				    chars[j+1] = temp;
				    isSwapped = true;
				}
			}
			if(isSwapped == false) {
				break;
			}
		}
		return new String(chars);
		
	}

}
