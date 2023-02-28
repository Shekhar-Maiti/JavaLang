// print of prime number in a range given by user?

import java.util.*;
public class Prime_num {
  public static boolean isPrime(int n){      //this function  will tell a number is prime or not
           for(int i=2;i<=n;i++){
            if(n%i==0){
              return false;
            }
           }
           return true;
  } 
  public static void prime_range(int a,int b){  // it will call the isprime function to
                                                // get prime number in a range    
    for(int i=a;i<b;i++){
      if(isPrime(i)){
        System.out.print( i+" " );
      }
    }
  

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the lower range:");
    int l=sc.nextInt();
    System.out.print("enter the upper range:");
    int u=sc.nextInt();
    prime_range(l,u);

  }

}


