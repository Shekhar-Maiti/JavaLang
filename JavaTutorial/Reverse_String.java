import java.util.*;
public class Reverse_String {
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
       // System.out.print("enter your name:- ");
        //String name=sc.nextLine();
        StringBuilder name= new StringBuilder("shekhar Maiti");
        for(int i=0;i<name.length()/2;i++){
            int front=i;
            int back=name.length()-1-i;
            char Frontchar= name.charAt(front);
            char Backchar=name.charAt(back);
            name.setCharAt(front, Backchar);
            name.setCharAt(back,Frontchar);
            
        }
        System.out.println(name);


    }
}
