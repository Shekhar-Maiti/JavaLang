import java.util.Scanner;

public class largestNo {
    public static void main(String args[]){
        int a,b,c;
        Scanner mysc = new Scanner(System.in);
        a = mysc.nextInt();
        b = mysc.nextInt();
        c = mysc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" is the largest no among three numbers");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is the largest among 3 numbers");
        }
        else{
            System.out.println(b+" is the largest no among three nos");
        }
    }
}
