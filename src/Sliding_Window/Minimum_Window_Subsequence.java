package Sliding_Window;

public class Minimum_Window_Subsequence {
    public static String minWindow(String str1, String str2) {
        // Write your code here
        int n = str1.length();
        int m = str2.length();
        int i = 0;
        int j = 0;
        int k = 0;
        String wd = "";
        int max = (int)1e8;
        while(j < n && k < m){
            if(str1.charAt(j) == str2.charAt(k)){
                k+=1;
            }
            if(k == str2.length()){
                k-=1;
                i = j;
                while(i>=0 && k>=0){
                    if(str1.charAt(i) == str2.charAt(k)){
                        k-=1;
                    }
                    i -= 1;
                }
                i+=1;
                if(max> j-i+1){
                    max = j-i+1;
                    wd = str1.substring(i, j+1);
                }
                k = 0;
                j = i;
            }
            j++;
        }
        return wd;

    }
}
