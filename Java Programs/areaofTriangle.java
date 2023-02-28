import java.util.Scanner;

import java.util.Scanner;

public class areaofTriangle{
    public static void main(String args[]){
        double h,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        h=sc.nextDouble();
        System.out.println("Enter base:");
        b=sc.nextDouble();
        double area=((h*b)/2);
        System.out.println("Area of triangle is:"+area);
    }
}
