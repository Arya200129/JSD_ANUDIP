// Diamond Star Pattern 
class PatternEg4{
    void printPattern(int number){
        int i,j;
        for(i=1; i<=number; i++){
            //inner loop to print space
            for(j=0; j<number-i; j++){
                System.out.print(" ");
            }
            //inner loop to print star
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=number-1; i>=1; i--){
            for(j=1; j<=number-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int number = 6;
        PatternEg4 p = new PatternEg4();
        p.printPattern(number);
    }
}