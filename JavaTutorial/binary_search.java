public class binary_search {
    public static int binsrch(int number[],int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
             if(number[mid]<key){ // for right side
                start= mid+1; 
            }
           else{
            end = mid-1;
           }
        }
        return -1;
    }
    public static void main(String args[]){
          int number[]={1,2,3,4,5,6,7,8,9,10};
          int key = 2;

              int index= binsrch(number, key);
              System.out.println("index of the key is: "+index);

    }
}
