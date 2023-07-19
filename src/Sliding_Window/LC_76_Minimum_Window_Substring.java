package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class LC_76_Minimum_Window_Substring {
    public String minWindow(String s, String t) {
        String ss = s;
        int n = s.length();
        int m = t.length();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for(int i = 0; i< m; i++){
            hashMap1.put(t.charAt(i), hashMap1.getOrDefault(t.charAt(i) , 0)+1);
        }
        int i = 0;
        int j = 0;
        int min = n+1;
        String wd = "";
        while(j < n){
            hashMap2.put(s.charAt(j), hashMap2.getOrDefault(s.charAt(j) , 0)+1);
            while(check(hashMap1, hashMap2)){
                if(j- i +1 < min){
                    wd = s.substring(i, j+1);
                }
                min = Math.min(min, j-i+ 1);
                hashMap2.put(s.charAt(i), hashMap2.getOrDefault(s.charAt(i) , 0) -1);
                i++;
            }
            j++;
        }
        return wd;
    }
    public boolean check(HashMap<Character, Integer> hashMap1, HashMap<Character, Integer> hashMap2){

        for(Map.Entry<Character, Integer> e: hashMap1.entrySet()){
            if(!hashMap2.containsKey(e.getKey()) || e.getValue() > hashMap2.get(e.getKey())){
                return false;
            }
        }
        return true;
    }
}
