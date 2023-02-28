public class butterfly {
    // public static void main(String args[]){
    //     int n=5;
    //     //for row
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
            
    //         int space=2*(n-i);
    //         for(int j=1;j<=space;j++){
    //             System.out.print(" ");
    //         }
    //             for(int j=1;j<=i;j++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //         for(int i=n;i>=1;i--){
    //             for(int j=1;j<=i;j++){
    //                 System.out.print("*");
    //             }
                
    //             int space=2*(n-i);
    //             for(int j=1;j<=space;j++){
    //                 System.out.print(" ");
    //             }
    //                 for(int j=1;j<=i;j++){
    //                     System.out.print("*");
    //                 }
    //                 System.out.println();
    //             }
    //     }

public static void main (String args[]){
    //upper half part loop
    int n=4; //n = row number of half part of butterfly
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*"); //first part star of half part of butterfly
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*"); //second part star of half part of butterfly
        }
        System.out.println();


    }
    for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
             System.out.print("*");
         } 
        for(int j=2*(n-i);j>=1;j--){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print("*");
       }
       System.out.println();
    }
}

    }

