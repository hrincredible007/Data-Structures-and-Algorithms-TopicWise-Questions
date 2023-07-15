package TwoPointer;

public class LC_1493_Longest_Subarray_of_1s_After_Deleting_One_Element {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int max = 0;
        int count = 0;
        int flag = 0;
        while (j < n) {
            if (nums[j] == 1) {
                j++;
            }
            else {
                flag = 1;
                if (count < 1) {
                    j++;
                    count++;
                }
                else {
                    if (nums[i] == 0) {
                        count -= 1;
                    }
                    i++;
                }
            }
            //System.out.println(i+"\t"+j+"\t"+count);
            max = Math.max(max, j - i + 1 - count);
        }
        if (flag == 0) {
            return max - 2;
        }
        return max - 1;


    }
}

