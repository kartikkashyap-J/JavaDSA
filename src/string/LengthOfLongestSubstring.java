package string;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        if (s.length()==0||s==null){
            return 0;
        }
        if (s.length()==1){
            return 1;
        }



        int left=0;
        int right=0;
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        while (right<s.length()){
            char c=s.charAt(right);
            while (set.contains(c)){
                set.remove(s.charAt(left));
                left+=1;
            }

            set.add(c);
            ans =Math.max(right-left+1,ans);
            right++;



        }
        return ans;
    }
    public static void main(String[] args){
        String s="kartikk";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
