public class pairs_ofnmbr {
    public static void pairArray(int number[]) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            int current = number[i];// 
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + current + "," + number[j] + ")");
                count++; // it will count total no of pairs
            }
            System.out.println();
        }
        System.out.println("total no of pair is: " + count); // (n*(n+1)/2)-- we can also use
                                                             // this formulae
    }

    public static void main(String args[]) {
        int number[] = { 23, 25, 21, 29, 64, 89, 74, 52 };
        

        for (int i = 0; i < number.length; i++) { // printing the original array
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.print("pair of this array is: ");

        System.out.println(); // next line after original array printing
        pairArray(number); // calling the printArray function
    }
}
