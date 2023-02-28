import java.util.*;

public class Binomial_coef {
    public static int Factorial(int numb){
        int fact=1;
        for(int i=1;i<=numb;i++){
            fact=i*fact;
        }
        return fact;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 'n' and 'r' in nCr:");
              int num1=sc.nextInt();
              int num2 =sc.nextInt();
              int n_fact=Factorial(num1);
              int r_fact=Factorial(num2);
              int nMr_fact=Factorial(num1-num2);
              System.out.println("nCr= "+n_fact/(r_fact*nMr_fact));

    }
}
