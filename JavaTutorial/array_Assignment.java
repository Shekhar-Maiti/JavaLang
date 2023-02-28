
//checking if a array has repeatatiive element or not
public class array_Assignment {
    public static boolean dublicte_element_check(int number[]){
        for(int i=0;i<number.length;i++){
           for(int j=i+1;j<number.length;j++){
            if(number[i]==number[j]){
                  return true;
            }
           }

        }
        return false;
    }
      
 
   public static void main(String args[]){
               int number[]={12,36,96,7,8,5};    
            // System.out.println(  dublicte_element_check(number));
            
            
   }
}
