import java.util.*;
import java.lang.Math;

public class Binary2deci {
            
            public static int convert(int num){
                int digits=0,last,temp, decimal=0;
                temp= num;
                // this while loop will tell how many digits are there in a number
                while(temp>0){
                    temp=temp/10;
                    digits++;
                }
                

                for(int i=0;i<=digits;i++){
                    int m=(int)Math.pow(2, i); 
                    last=num%10;
                        decimal=decimal+last*m;
                        num= num/10;
                        
                    }
                 
                return decimal;
             } 
             
             public static void main(String[] args){
                
                 System.out.print("enter the Binary number: ");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                    int b=(convert(number));
               System.out.print("Decimal of "+number+" is :"+b);
                

                
             }
}
// public class Binary2deci{
//     public static void main(String[] args){
//         int n=1%10;
//         System.out.println(n);
//     }
// }

