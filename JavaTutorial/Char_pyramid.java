import java.util.*;
public class Char_pyramid {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many line you want: ");
        int n=sc.nextInt();
        char ch ='A';
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
    }
}
