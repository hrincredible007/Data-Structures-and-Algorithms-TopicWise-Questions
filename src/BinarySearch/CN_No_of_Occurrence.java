package BinarySearch;

public class CN_No_of_Occurrence {
    public static int count(int nums[], int n, int x) {
        //Your code goes here
        int low = 0;
        int high = n-1;
        int ans = -1;
        int ans2 = n;
        while(low <= high){
            int mid = low+ (high- low)/2;
            if(nums[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+ 1;
            }
        }

        low = 0;
        high = n-1;
        while(low <= high){
            int mid = low+ (high- low)/2;
            if(nums[mid] >x){
                ans2 = mid;
                high = mid-1;
            }
            else{
                low = mid+ 1;
            }
        }
        ans2 -=1;
        // System.out.println(ans+"\t"+ans2);
        if(ans == -1 && nums[ans2] != x){
            return 0;
        }
        if(ans == ans2){
            return 1;
        }
        return ans2- ans+1;

    }
}
