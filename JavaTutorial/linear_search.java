public class linear_search {
    public static int lin_srch(int key,int number[]){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
            
        return -1;
            
        
    }
    public static void main (String args[]){
         int number [] = {12,13,14,15,16,78,52,65,45};
         int key = 32;
        int index= lin_srch(key, number);
        if(index==-1){
            System.out.println("number is not present in given array");
        }
        else{
            System.out.println("number is present at index: "+index);
        }

    }
}
