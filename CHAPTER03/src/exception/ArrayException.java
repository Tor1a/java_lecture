package exception;

public class ArrayException {
	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;
		try {
		for(int i=0;i<5;i++){
		intArray[i+1] = i+1;
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다");
		}
	}
}
