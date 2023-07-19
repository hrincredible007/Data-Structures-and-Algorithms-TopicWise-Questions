package Sliding_Window;

public class LC_1423_Maximum_Points_You_Can_Obtain_from_Cards {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int nu = n-k;
        int tSum = 0;
        for(int e: nums){
            tSum += e;
        }
        int sum = 0;
        for(int i = 0; i< nu; i+=1){
            sum += nums[i];
        }
        if(nu == 0){
            return tSum;
        }
        System.out.println(sum);
        int j = 1;
        int min = sum;
        while(j+nu-1 < n){
            sum -= nums[j-1];
            sum += nums[Math.min(j+nu-1, n-1)];
            min = Math.min(min, sum);
            System.out.println(sum);
            j++;
        }
        return tSum-min;
    }
}
