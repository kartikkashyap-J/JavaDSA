package string;

public class StringAnagram {
    public static Boolean stringAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }

        int[] countChart=new int[26];

        for (int i =0;i<s.length();i++){
            countChart[s.charAt(i)-'a']++;
            countChart[t.charAt(i)-'a']--;
        }
        for (int chr:countChart){
            if (chr!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="krta";
        String t="akrt";
        System.out.println(stringAnagram(s,t));
    }
}
