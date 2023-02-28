public class Array_reverse {
    public static void getArray(int number[]){
        int first=0;
        int last = number.length-1;
        while(first<last){
            //swaping the value of array untill 
            //the first index  value and last index value is equal
            int temp = number[first];
             number[first]=number[last];
             number[last]=temp;
             first++;
             last--;
             
        }

    }
    public static void main(String args[]){
             int number[]={2,4,6,58,98,78,25,36,35};
             System.out.print("present array is:        ");
             for(int i=0;i<number.length;i++){
                 System.out.print(number[i]+" ");
                }
                System.out.println();
            
             getArray(number);
             System.out.print("reverse of the array is: ");
             for(int i=0;i<number.length;i++){
                 System.out.print(number[i]+" ");
                }
            }
            
        }
