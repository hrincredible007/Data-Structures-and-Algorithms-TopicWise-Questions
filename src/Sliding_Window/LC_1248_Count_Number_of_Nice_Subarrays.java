package Sliding_Window;

import java.util.HashMap;

public class LC_1248_Count_Number_of_Nice_Subarrays {
    // Approach 1: T.C.: O(N), S.C.: O(N)
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0; i< n; i+=1){
            nums[i] = nums[i]%2 == 0?0:1;
        }
        // After changing the elements of the array nums like even to 0 and odd to 1,
        // The question is similar to the Binary_Subarrays_With_Sum

        int j = 0, sum = 0, count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(j< n){
            sum += nums[j];
            if(sum == k){
                count+=1;
            }
            if(hashMap.containsKey(sum- k)){
                count+= hashMap.get(sum- k);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0)+1);
            j++;
        }
        return count;
    }
}
