package searching;

public class BinarySearch {
    public int binary(int []nums, int target){
        int left=0;
        int right=nums.length-1;
        int times=0;
        while(left<=right){
            times++;
            int mid=(right+left)/2;
            if(nums[mid]==target){
                System.out.println("iterations in binary search :"+times);
                return mid;
            } else if (nums[mid]<target) {

                left=mid+1;

            }else
                right=mid-1;

        }

        return -1;
    }
}
