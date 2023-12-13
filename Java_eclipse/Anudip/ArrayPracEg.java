package Anudip;

public class ArrayPracEg {
	public static void main(String[] args) {
		int score[] = {56,34,65,87,65,98,76,56,76,86};
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i]==score[j]) { //39 == 39
					System.out.println(score[j]);
				}
			}
		}
		System.out.println();
		
		//reverse an array
		for(int i = (score.length)-1; i>=0; i--) {
			System.out.println(score[i]);
		}
		System.out.println();
		
		//print evenodd number
		int numbers[] = {2,6,3,8,3,9,4,5};
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2!=0) {
				System.out.println(numbers[i]); //odd
			}
		}
		System.out.println();
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]); //even
			}
		}
	}
}
