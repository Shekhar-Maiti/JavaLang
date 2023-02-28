
import java.util.*;

public class Product_fn {
    public static int product(int a,int b){
          int prod=a*b;
          return prod;    
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a and b : ");
    int a=sc.nextInt();
    int b =sc.nextInt();
   int Ans=  product(a, b);
    System.out.println("Multiplication of a and b: "+Ans);


}
}
