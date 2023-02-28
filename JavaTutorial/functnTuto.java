import java.util.*;
public class functnTuto {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        System.out.println("enter your name: ");
     Scanner sc= new Scanner(System.in);

     String name=sc.nextLine();


        printMyName(name);
    }
}
