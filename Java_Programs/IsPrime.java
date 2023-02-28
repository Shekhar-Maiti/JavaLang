import java.util.Scanner;

public class IsPrime {
    public static void main(String args[]){
        int n;
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter no:");
        n= myobj.nextInt();
        for (int i=2; i<n; i++){
            if(n%i==0){
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}
