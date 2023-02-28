// TRAPPING rain WATER problem

public class Trapping_rainwater {
            
     public static void water_level(int height[]){
          int n=height.length;
         int water_level,trapped_water=0;
          int lt_sub_array[]=new int[height.length];
          lt_sub_array[0]=height[0];// as there is no slab in left side 
          // creating left sub array or auxilarry array
          for(int i=1;i<n;i++){
               lt_sub_array[i]=(int)Math.max(height[i],lt_sub_array[i-1]);
               
          }
           System.out.println();
          // creating right sub array

         int rt_sub_array[]=new int[n];
              
            rt_sub_array[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){        //reverse loop for rt array as it will go reverse from i.e from left to 
                                              //  right
                rt_sub_array[i]=(int)Math.max(height[i],rt_sub_array[i+1]);
                

            }
          //   // print right max sub array
          //   for(int i=0;i<n;i++){
          //      System.out.print(rt_sub_array[i]);
          //   }
          //   System.out.println();
          //   // print left sub array
          //   for(int i=0;i<n;i++){
          //      System.out.print(lt_sub_array[i]);
          //   }
          //   System.out.println();
            //loop
            for(int i=0;i<n;i++){
                water_level=(int)Math.min(rt_sub_array[i],lt_sub_array[i]);

                 trapped_water+=(water_level-height[i]);     
                  
            }
             System.out.println("total water present is: "+trapped_water*1);

     }
     public static void main (String args[]){
          int height[]={4,2,0,6,3,2,5};
          water_level(height);

     }
}
