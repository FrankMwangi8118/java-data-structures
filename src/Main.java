import searching.BinarySearch;
import searching.LinearSearch;
import sorting.BubbleSorting;
import sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();
        BubbleSorting bubbleSorting = new BubbleSorting();
        SelectionSort selectionSort = new SelectionSort();

        int nums[] = {1, 4, 5, 2, 3, 8, 9, 6, 7};
        System.out.println(linearSearch.linear(nums, 6));
        System.out.println(binarySearch.binary(nums, 6));
        // sorting
//        bubbleSorting.bubbleSort(nums);
        selectionSort.selectionSort(nums);
    }

}