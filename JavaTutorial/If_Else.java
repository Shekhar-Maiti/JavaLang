import java.util.*;

public class If_Else {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the button: ");
        int button = sc.nextInt();
        if(button ==1){
            System.out.println("Namste");
        }
        else if (button==2){ 
                System.out.println("Hello");
        }
        else if(button==3){ 
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Button");
        }
    }
}
