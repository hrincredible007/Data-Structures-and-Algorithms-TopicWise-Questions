package BinarySearch;

public class LC_704_BinarySearch {
    // Iterative
    public int bin_search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n -1;

        while(low<= high){
            int mid = low+ (high- low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    //Recursive
    public static int sol(int[] nums, int low, int high, int target){
        if(low> high){
            return -1;
        }
        int mid = low+ (high- low)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target){
            return sol(nums, mid+1, high, target);
        }
        else{
            return sol(nums, low, mid-1, target);
        }
    }
}
