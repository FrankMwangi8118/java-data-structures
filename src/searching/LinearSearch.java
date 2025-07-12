package searching;

public class LinearSearch {

    public int linear(int[] nums, int target) {
        int times = 0;
        for (int n = 0; n < nums.length; n++) {
            times++;
            if (nums[n] == target) {
                System.out.println("iterations in linear search :" + times);
                return n;
            }
        }

        return -1;
    }

}
