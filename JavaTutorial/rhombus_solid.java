public class rhombus_solid {
    public static void main(String args[]){
       // row no. = "n"
       int n= 5;
          for(int i=1;i<=n;i++){
            // space
            int space = (n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();

          }
    }
}
