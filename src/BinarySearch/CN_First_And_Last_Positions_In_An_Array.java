package BinarySearch;

import java.util.ArrayList;

public class CN_First_And_Last_Positions_In_An_Array {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        //lower bound
        int low = 0;
        int high = n-1;
        int ans1 = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr.get(mid) >= k){
                ans1 = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        low = 0;
        int ans2 = n;
        high = n-1;
        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr.get(mid) > k){
                ans2 = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        int[] res = new int[2];
        ans2 -=1;
        res[0] = ans1;
        res[1] = ans2;
        if(ans1!=-1 && arr.get(ans1) != k){
            res[0] = -1;
        }
        if(ans2 >=0 && arr.get(ans2) != k){
            res[1] = -1;
        }
        return res;
    }
}
