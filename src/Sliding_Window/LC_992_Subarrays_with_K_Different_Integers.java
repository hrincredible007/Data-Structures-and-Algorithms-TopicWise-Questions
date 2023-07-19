package Sliding_Window;
import java.util.*;
public class LC_992_Subarrays_with_K_Different_Integers {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sol(nums, k) - sol(nums, k-1);
    }
    public int sol(int[] nums, int k){
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(j < n){
            hashMap.put(nums[j], hashMap.getOrDefault(nums[j], 0)+1);
            while(hashMap.size() > k){
                if(hashMap.get(nums[i]) == 1){
                    hashMap.remove(nums[i]);
                }
                else{
                    hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)-1);
                }
                i++;
            }
            count+= j-i+1;
            j++;
        }
        return count;
    }
}
