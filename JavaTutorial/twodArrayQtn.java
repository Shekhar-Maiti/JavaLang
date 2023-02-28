import java.util.*;


public class twodArrayQtn {
    public static void main(String args[]){
             Scanner sc =new Scanner(System.in);
            System.out.print("enter the number of rows: ");
            int rows=sc.nextInt();
            System.out.print("enter the number of colomns: ");
            int colm=sc.nextInt();
            int numbers[][]=new int[rows][colm];
            //input
            for(int i=0;i<rows;i++){
                for(int j=0;j<colm;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
            System.out.print("enter the number which you want to find: ");
            int x=sc.nextInt(); 
            
            //otput
            for(int i=0;i<rows;i++){
                for(int j=0;j<colm;j++){
                    if(x==numbers[i][j]){
                        System.out.print( "index of 'x'is: "+i+","+j+" ");
   

                    }
                }
            }
        }}




    

