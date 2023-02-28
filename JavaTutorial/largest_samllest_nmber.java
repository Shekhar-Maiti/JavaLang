public class largest_samllest_nmber { 
    public static int getNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }

        }
        System.out.println("largest number in the array is :"+largest);
        return smallest;
    }

    public static void main(String args[]) {
        int number[] = { 12, 13, 14, 35, 95, 369, 456, 25, 1 };
        System.out.println("smallest number in the array is: " + getNumber(number));

    }
}
