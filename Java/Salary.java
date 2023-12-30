import java.util.Scanner;   //importing scanner to take input of basic salary

class Salary{
  
  //calculate da and hra according to conditions
  public double grossSalary(double basic_sal){

    double hra,da;

    if(basic_sal > 15000){
      hra = basic_sal * 0.2;
      da = basic_sal * 0.6;
    }
    else{
      hra = 3000;
      da = basic_sal * 0.7;
    }

    return basic_sal + hra + da;
  }
  

  public static void main(String args[]){
    Salary sal = new Salary();
    Scanner sc = new Scanner(System.in);
    double basic_sal, gross;
    int choice;

    // do while to print the output atleast once
    do{
      System.out.println("Enter your basic salary: ");
      basic_sal = sc.nextInt();

      //printing gross salary
      gross = sal.grossSalary(basic_sal);
      System.out.println("Your Gross Salary is "+gross);

      //user input to continue
      System.out.println("Do you want to continue? (type -1 to exit and any key to exit)");
      choice = sc.nextInt();

    }while(choice != -1); //to terminate loop
  }
}