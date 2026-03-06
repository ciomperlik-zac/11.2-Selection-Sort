public class Main {
    public static void main(String[] args) {
        int[] array = { 29, 10, 14, 37, 13 };
        System.out.println("Original Array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        int start = 0;

        for (int i = 0; i < array.length; i++) {
            int minIndex = start;

            for (int i_ = start; i_ < array.length; i_++) {
                if (array[i_] < array[minIndex])
                    minIndex = i_;
            }

            int temp = array[start];
            array[start] = array[minIndex];
            array[minIndex] = temp;

            start++;
        }
    }
}