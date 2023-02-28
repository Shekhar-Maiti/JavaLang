/*import java.util.*;
public class ArrayHomework {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int size=sc.nextInt();
        String array[]=new String[size];
        int totLength=0;
        for(int i=0;i<size;i++){
            System.out.println("Enter the Element no: "+(i+1));
            
            array[i]=sc.next();
            totLength += array[i].length();
        }
        
        System.out.println("length of the string is: "+totLength);
    }

}*/
import java.util.*;
public class ArrayHomework{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        
        int size=sc.nextInt();
        String array[]=new String[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the element no: "+(i+1)+" ");
            array[i]=sc.next();
        }
        //System.out.println(array.length);
        
        String results[]= new String[array.length];
        for(int i= 0;i<array.length;i++){
            if(array[i].charAt(i)!='e'){              results[i]=array[i];

            }
            
        }
        System.out.println("final array will be: "+results);
    }
}


