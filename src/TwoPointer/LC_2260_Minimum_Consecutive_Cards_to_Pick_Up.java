package TwoPointer;

import java.util.HashMap;

public class LC_2260_Minimum_Consecutive_Cards_to_Pick_Up {
    public int minimumCardPickup(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int min = n+1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(j < n){
            if(hashMap.containsKey(nums[j])){
                int ans = hashMap.get(nums[j]);
                min = Math.min(min, j- ans+1);
                hashMap.remove(nums[i]);
                i++;
            }
            hashMap.put(nums[j], j);
            j++;
        }
        return min == n+1? -1: min;
    }

}
