package TwoPointer;

import java.util.HashMap;

public class LC_1358_Number_of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int count = 0;
        int[] nums = new int[]{0, 0, 0};
        while (i < n && j < n) {
            // hashMap.put(s.charAt(j), hashMap.getOrDefault(s.charAt(j), 0)+1);
            nums[s.charAt(j) - 'a']++;
            // if(hashMap.containsKey('a') && hashMap.containsKey('b') && hashMap.containsKey('c')){
            // while(hashMap.get('a')>=1 && hashMap.get('b')>=1 && hashMap.get('c')>=1){
            while (nums[0] >= 1 && nums[1] >= 1 && nums[2] >= 1) {
                count += n - j;
                // hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) -1);
                nums[s.charAt(i) - 'a']--;
                i++;

            }
            j++;
        }
        return count;
    }
}
