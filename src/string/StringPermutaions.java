package string;

import static com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil.matches;

public class StringPermutaions {
    public static boolean stringPermutaions(String s1, String s2){
        if (s1.length()>s2.length()){
            return false;
        }
        int[] s1Space=new int[26];
        int[] s2Space=new int[26];

        for (int i=0;i<s1.length();i++){
            s1Space[s1.charAt(i)-'a']++;
            s2Space[s2.charAt(i)-'a']++;
        }

        for (int i=0;i<s2.length()-s1.length();i++){
            if (matches(s1Space,s2Space)){
                return true;
            }
            s2Space[s2.charAt(i+s1.length())-'a']++;
            s2Space[s2.charAt(i)-'a']--;

        }
        return matches(s1Space,s2Space);
    }
    private static boolean matches(int[] s1Space, int[] s2Space) {

        for (int i=0;i<26;  i++){
            if (s1Space[i]!=s2Space[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        String s1="as";
        String s2="abstract";
        System.out.println(stringPermutaions(s1,s2));

    }

}
