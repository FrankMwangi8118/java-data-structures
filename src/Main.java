import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class Main {
    public static void main(String[] args) {
       LinearSearch linearSearch = new LinearSearch();
       BinarySearch binarySearch = new BinarySearch();
        int nums[]= {1,2,3,4,5,6};
        System.out.println(linearSearch.linear(nums,2));
        System.out.println(binarySearch.binary(nums,1));
    }
}