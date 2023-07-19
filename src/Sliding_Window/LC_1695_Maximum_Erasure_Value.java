package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class LC_1695_Maximum_Erasure_Value{
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while(j< n){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum += nums[j];
                j++;
            }
            else{
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            // Calculate the sum in the set
            // Integer integerSum = set.stream().mapToInt(Integer::intValue).sum();
            max = Math.max(max, sum);
            // System.out.println(set+"\t"+sum);
        }
        return max;
    }
}
