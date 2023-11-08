//Right Half Pyramind Pattern 
class PatternEg2{

    void printPattern(int number){
        int i,j;
        //outer loop for handle rows
        for(i=1; i<=number; i++){
            for(j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int number = 6;
        PatternEg2 p = new PatternEg2();
        p.printPattern(number);
    }
}