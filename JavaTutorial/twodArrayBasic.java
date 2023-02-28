import java.util.*;

public class twodArrayBasic {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("enter the number of coloumn: ");
        int colm=sc.nextInt();
        int numbers[][]=new int[rows][colm];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){

                
                 numbers[i][j]=sc.nextInt();

            }
        }
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }



    }
    
}
