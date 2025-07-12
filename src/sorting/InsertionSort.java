package sorting;

public class InsertionSort {

    //we shift

    public int[] insertionSort(int[] array) {

        int j, key;

        //0,1,2,3,4,5
        //2,3,5,7,9,4
        System.out.println("before sorting");
        for (int n : array) {

            System.out.print(" " + n);
        }


        for (int i = 1; i < array.length; i++) {
            j = i - 1;
            key = array[i];
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                for (int n : array) {
                    System.out.print(" " + n);
                }
                System.out.println();
            }
            array[j + 1] = key;

        }
        System.out.println("\n after sorting");
        for (int n : array) {
            System.out.print(" " + n);
        }

        return array;
    }

}
