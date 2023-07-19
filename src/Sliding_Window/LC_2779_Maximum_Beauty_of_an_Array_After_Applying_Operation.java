package Sliding_Window;

import java.util.Arrays;

public class LC_2779_Maximum_Beauty_of_an_Array_After_Applying_Operation {
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int max = 0;
        int j = 0;
        while(j < n){
            if(nums[j] - nums[i] > 2*k){
                i++;
            }
            max = Math.max(j- i+1, max);
            j++;
        }
        return max;
    }
}
