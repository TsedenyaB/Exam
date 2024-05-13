package DsaLab2;

public class Lab2 {
	
	int top;
	int[] array;
	int size;
	
	public Lab2(int capacity) {
		top = -1;
		this.array =  new int[capacity];
		size = 0;
				
	}
	
	void push(int value) {
		if(!isFull()) {
			array[++top] = value;
			size++;
		}
		else {
			System.out.println("The stack is full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int data = array[top--];
			size--;
			return data;
			
		}
		return -1;
	}
	
	public int peek() {
		if(top >= 0) {
			return array[top];
		}
		else {
			return -1;
		}
		
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == array.length;
	}
	
	public static void main(String[] args) {
		Lab2 stack = new Lab2(4);
		stack.push(12);
		stack.push(34);
		stack.push(77);
		stack.push(89);
		
		
		int result = stack.peek();
		System.out.println(result);
	
		for(int i = 0; i<stack.size; i++) {
			System.out.println(stack.array[i]);
		}
		
	}
	

}
