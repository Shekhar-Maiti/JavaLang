import java.util.*;
public class Stringbuilder{
    public static void main(String args[]){
        //stringBuilder Systax:-
        StringBuilder name=new StringBuilder("shekhar");
        System.out.println(name);

        //print a particular index
        System.out.println(name.charAt(0));

        //REPLACE CHARACTER SYNTAX:-
        name.setCharAt(2,'i');
        System.out.println(name);

        //INSERT SOME CHARACTER AT ANY INDEX:-
        name.insert(2,'e');
        System.out.println(name);

        //DELETE CHARACTER:-
        name.delete(3,4);
        System.out.println(name);

        //Append in string_Builder:-
        name.append(" ");
        name.append("m");
        name.append("a");
        name.append("i");
        name.append("t");
        name.append("i");
        System.out.println(name);
        //Length of String_Builder:-
        System.out.println(name.length());
    
    }
        
}
  
