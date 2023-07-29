package BinarySearch;

import java.util.Arrays;

public class CN_Ceil_The_Floor {
    public static int ceilingInSortedArray(int n, int x, int[] nums) {
        // Write your code here.
        Arrays.sort(nums);
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<= high){
            int mid = low+ (high- low)/2;
            if(nums[mid] <=x){
                ans = nums[mid];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        int ans2 = -1;
        low = 0;
        high = n-1;
        while(low<= high){
            int mid = low+ (high- low)/2;
            if(nums[mid] >=x){
                ans2 = nums[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.print(ans+" ");
        return ans2;
    }
}
