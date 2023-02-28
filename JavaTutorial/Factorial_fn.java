//Calculation of factorial Using funtion
import java.util.*;

public class Factorial_fn {
    
    public static int Factorial(int numb){
          int fact=1;
          
          for(int i=1;i<=numb;i++){
            fact=fact*i;
          }
          return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        int Fact=Factorial(number);
        System.out.println("factorial of " +number+ " is:  "+ Fact);
    }
}
