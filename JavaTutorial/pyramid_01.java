// public class pyramid_01 {
//     public static void main (String args[]){
//         int num=1;
//         for(int i=1;i<=5;i++){
//              for(int j=1;j<=i;j++){
//                    System.out.print(num+" ");
//                    /*  this will assign "0" or "1" to num variable
//                    alternatively  */
//                    if(num==0){ 
//                     num=1;
//                    }
//                    else if(num==1){
//                     num=0;
//                    }
//              }
//              System.out.println();
             
//         }
        
//     }
// }
public class pyramid_01{
    public static void main (String args[]){
        for(int i=1;i<=5;i++){
          for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1  );
                }
                else{
                    System.out.print(0 );
                }
          }
          System.out.println();
    }
}
}