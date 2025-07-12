import searching.BinarySearch;
import searching.LinearSearch;
import sorting.BubbleSorting;

public class Main {
    public static void main(String[] args) {
       LinearSearch linearSearch = new LinearSearch();
       BinarySearch binarySearch = new BinarySearch();
        BubbleSorting bubbleSorting = new BubbleSorting();
        int nums[]= {1,4,5,2,3,8,9,6,7};
        bubbleSorting.bubbleSort(nums);
        System.out.println(linearSearch.linear(nums,6));
        System.out.println(binarySearch.binary(nums,6));
    }
}