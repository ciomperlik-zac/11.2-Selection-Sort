public class Main {
    public static void main(String[] args) {
        int[] array = { 29, 10, 14, 37, 13, 543, 7, 17, 2, 8, 12, 15, 56 };
        System.out.println("Original Array: ");
        printArray(array);

        selectionSort(array);
        System.out.println("Ascending Array: ");
        printArray(array);

        selectionSort(array, false);
        System.out.println("Decending Array: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        selectionSort(array, true);
    }

    public static void selectionSort(int[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int i_ = i + 1; i_ < array.length; i_++) {
                if (ascending) {
                    if (array[i_] < array[minIndex])
                        minIndex = i_;
                } else {
                    if (array[i_] > array[minIndex])
                        minIndex = i_;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}