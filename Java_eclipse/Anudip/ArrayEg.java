package Anudip;

public class ArrayEg {
	
	static void show(String namess[]) {
		for(int i=0; i<namess.length; i++) {
			System.out.println(namess[i]);
		}
		
		for (String a : namess) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		int[] scoree;//declare
		int score1[];
		int score2[] = new int[5];//declare and instantiation
		score2[0] = 45; //initialization
		score2[1] = 55;
		score2[2] = 75;
		score2[3] = 35;
		score2[4] = 95;
		
		int score[] = {56,34,65,87,65,98,76,56,76,86}; //declare, instantiation, and initialization
		
		//printing
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		String namess[] = {"abc","ed","ghi","mop"};
		ArrayEg.show(namess);

	}

}
