package sorting;

public class SelectionSort {
    //sorted sections

    public int[] selectionSort(int[] array) {

        int size = array.length;
        int temp = 0;
        int minIndex = -1;
        int iteration=0;

        //outer loops
        for (int i = 0; i < size - 1; i++) {

            minIndex = i;

            for (int j = i + 1; j < size; j++) {
                iteration++;

                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
                System.out.println("number of iterations : "+ iteration);

            }

            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            for (int n : array) {
                System.out.print(n + " ");
            }
            System.out.println();

        }

        return array;

    }

}
