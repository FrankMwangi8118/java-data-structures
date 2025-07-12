package sorting;

public class BubbleSorting {
    public int[] bubbleSort(int[] arr) {
        //2,4,7,5,8
        //2,4,5,7,8

        int iterations = 0;
//        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                iterations++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    swapped = true;
                }
                System.out.println("after swap : number of iterations : "+ iterations );
                for (int n : arr) {
                    System.out.print(n + " ");
                }
                System.out.println();

            }
//            if (swapped) break;
        }


        return arr;

    }
}
