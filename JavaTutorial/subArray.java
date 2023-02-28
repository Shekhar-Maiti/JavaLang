//method(1): largest sub array sum by brutfoece method

public class subArray {
          // method(1):               
    public static void getSubArray(int number[]){
            int count=0;
            int largest_sum=Integer.MIN_VALUE;
            for( int i=0;i<number.length;i++){
                      for(int j=i+1;j<number.length;j++){
                       int  sum=0; //intialize the sum with 0 so that it can count
                                    // the total of new array
                        System.out.print("[");
                        for(int k=i;k<=j;k++){
                            System.out.print(number[k]+" ");
                            sum+=number[k];
                        }
                        count++;
                        
                        System.out.print("] = "+sum);
                        if(largest_sum<sum){
                            largest_sum=sum;
                        }
                        System.out.println();
                      } 
 
            }
            System.out.println("total sub array: "+count);
            System.out.println("largest sum of sub array by brutforce is: "+largest_sum);
    }
    // method(2): prefix method
      
     public static void prefix_method(int number[]){
                     int prefix[]=new int[number.length];
                    int sum=0;
                   int max_num=Integer.MIN_VALUE;

                   prefix[0]=number[0];
                   //calculating prefix Array
                   for(int i=1;i<number.length;i++){
                    prefix[i]=prefix[i-1]+number[i];
                   }

             for(int i=0;i<number.length;i++){
                for(int j=i;j<number.length;j++){
                    sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
                    if(max_num<sum){
                        max_num=sum;
                    }
                }
             } 
             System.out.println("max sum of the array by prefix method:"+max_num);     
     }

    // method(3): kadanes Algorithm:-

        public static void kadanesArray(int number[]){
            int curr_sum=0;
            int max_sum=Integer.MIN_VALUE;
             for(int i=0;i<number.length;i++){
                curr_sum+=number[i];
                if(curr_sum<0){
                    curr_sum=0;
                }
                max_sum=(int)Math.max(max_sum, curr_sum);
             }
              
             System.out.println("max sub array by kadanes algorithm: "+max_sum);
        }

    public static void main(String args[]){
        int number[]={36,89,52,45,87,15,38};
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
        System.out.println("sub_array of the above array: ");
        getSubArray(number);
        
        prefix_method(number);

        kadanesArray(number);

        

    }
 
}
