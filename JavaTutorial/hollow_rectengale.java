public class hollow_rectengale {
    public static void rect(int totRows,int totColms){
        //for outer lines or rows
        for(int i=1;i<=totRows;i++){

            // for inner lines or columns
                  for(int j=1;j<=totColms;j++){
                    if(i==1||i==totRows||j==1||j==totColms){
                            System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                  }
                  System.out.println();
        }
    }
    public static void main(String args[]){
                  rect(5,10);
    }
}
