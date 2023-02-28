public class Ascending_array {
    public static void getArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                while (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int number[] = { 12, 14, 8, 9, 69, 78 };
        System.out.print("Original array: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        getArray(number);
        System.out.print("Reverse array in ascending order: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
