package Practice.Repl;
import java.util.Scanner;

public class Task_037 {

    public static void main(String[] args) {
        //Write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter number of coupons:");
        int coupon = scan.nextInt();
        int candies = coupon /10;
        int gumballs = (coupon-(candies * 10))/3;


        if(coupon >= 10) {
            System.out.println("Number of Candies: " + candies);
            System.out.println("Number of Gumballs: " + gumballs);
        }else if (coupon<10 && coupon >= 3){
            System.out.println("Number of Candies: " + candies);
            System.out.println("Number of Gumballs: " + gumballs);
        }else{

            System.out.println("Not enough coupons");
        }



    }
}
/*
 public static void main(String[] args) {
    //WRITE YOUR CODE HERE

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
    int seniorCitizens = scan.nextInt();
    int nonSeniorCitizens = scan.nextInt();
    System.out.println("What is new citizen's age?");
    int age = scan.nextInt();

    if(age >= 65){
      System.out.println("Senior Citizen");
      seniorCitizens++;
    }else if(age < 65 ){
      System.out.println("Non-Senior Citizen");
      nonSeniorCitizens++;
    }else{
      System.out.println();
    }
    System.out.println("New seniorCitizens count " + seniorCitizens);
    System.out.println ("New nonSeniorCitizens count "+ nonSeniorCitizens);

  }
 */
