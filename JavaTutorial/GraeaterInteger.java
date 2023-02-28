import java.util.*;
public class GraeaterInteger {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        int arrays[]=new int[size];
        //input
        for(int i=0;i<size;i++){
            System.out.println("enter the element no: "+i);
            arrays[i]=sc.nextInt();
     }
        int max=Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //OUTPUT
        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
            if(arrays[i]<min){
                min=arrays[i];
            }
            if(max>arrays[i]){
                max=arrays[i];
            }
            
        }
        System.out.println("largest nunber is"+max);
        System.out.println("smallest number is "+min);

    }
}
