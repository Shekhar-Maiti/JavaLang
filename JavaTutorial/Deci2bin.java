public class Deci2bin {
    public static void conv(int num){
        int fact=1;
        int decimal=0;
        int Mynum=num;
        while( num>0){
            int r=num%2; 
            decimal=decimal+(r*fact);
            fact=fact*10;
            num=num/2; // this will divide the number by 2 and store the integer result
        }
        System.out.println("binary of "+Mynum+"= "+decimal);

    }
    public static void main(String args[]){
        conv(11 );
    }
}
