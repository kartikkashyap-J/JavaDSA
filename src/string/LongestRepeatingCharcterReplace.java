package string;

public class LongestRepeatingCharcterReplace {
    public static int longestRepeatingCharcterReplace(String s, int k) {

        int[] freq = new int[26];   // A–Z ka count
        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            // add current character
            char ch = s.charAt(right);
            freq[ch - 'a']++;

            // update most frequent character in window
            maxFreq = Math.max(maxFreq, freq[ch - 'a']);

            // agar window invalid ho jaye
            while ((right - left + 1) - maxFreq > k) {
                char remove = s.charAt(left);
                freq[remove - 'a']--;
                left++;
            }

            // update answer
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
    public static void main(String[] args){
        String s="abababa";
        int k=1;
        System.out.println(longestRepeatingCharcterReplace(s,k));
    }
}
