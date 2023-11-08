import java.util.Scanner; //import scanner package

class ScannerEg{
    //default method to perform result
    public void calc_Result(int marks){
        boolean status = true;
        //outer condition
        if(status==true){
            System.out.println("You are present");
            //inner multi condition
            if(marks<=99 && marks>80){
                System.out.println("Your grade is O ...Outstanding");
            }
            else if(marks<=80 && marks>65){
                System.out.println("Your grade is A ...Very Good");
            }
            else if(marks<=65 && marks>55){
                System.out.println("Your grade is B ...Good");
            }
            else if(marks<=55 && marks>45){
                System.out.println("Your grade is C ...Average");
            }
            else if(marks<=45 && marks>35){
                System.out.println("Your grade is D ...Poor");
            }
            else{
                System.out.println("Failed... You score very less...");
            }
        }
        else{
            System.out.println("You were Absent in assessment");}
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter marks:");
        int marks = sc.nextInt(); //input from user

        ScannerEg obj = new ScannerEg();
        obj.calc_Result(marks); //invoke method
    }
}