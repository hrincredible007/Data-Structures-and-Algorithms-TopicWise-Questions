package TwoPointer;

import java.util.HashMap;

public class LC_930_Binary_Subarrays_With_Sum {
    // Approach 1: T.C.: O(N), S.C.: O(N)
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int j = 0;// 1
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(j < n){//0, 1, 2, 3, 4
            sum = sum + nums[j];// 1, 1, 2, 2, 3
            if(sum == goal){
                count++; // 1 2
            }
            if(hashMap.containsKey(sum -goal)){
                count += hashMap.get(sum- goal); // 4
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0)+1);// 1 : 2, 2 : 2
            j++;
        }
        return count;

    }
}
