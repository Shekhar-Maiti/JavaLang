import java.util.*;
public class SwitchCase{
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      int button =sc.nextInt();
      switch(button){
        case 1: System.out.println("sunday");
        break;
        case 2:System.out.println("monday");
        break;
        case 3: System.out.println("tuesday");
        break;
        default : System.out.println("invalid button");
      }
    }
  }
}











