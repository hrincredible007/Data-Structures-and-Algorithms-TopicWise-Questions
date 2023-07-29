package BinarySearch;

public class CN_Search_Insert_Position {
    public static int searchInsert(int [] nums, int m){
        // Write your code here.
        int n = nums.length;
        int low = 0;
        int high = n -1;
        while(low <= high){
            int mid = low+ (high- low)/2;
            if(nums[mid] == m){
                return mid;
            }
            if(nums[mid]< m){
                low = mid+1;
            }
            else{
                high = mid-1;;
            }
        }
        return low;
    }
}
