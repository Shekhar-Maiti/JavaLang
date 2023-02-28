import java.util.*;
public class Fn_overloading {
    // //function with two parameter
    // public static int sum(int num1,int num2){
    //     return num1+num2;

    // }
    // //same function with 3 parameter
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    public static  int sum(int a, int b){
               return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
     public static void main(String[] args){
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.8f));
     }
}
