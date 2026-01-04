package array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class GroupAnagram {
    public static List<List<String>> groupAnagram(String[] strs){
        HashMap<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            int[] count=new int[26];

            for (Character c:s.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder key=new StringBuilder();
            for (int i=0;i<26;i++){
                key.append(count[i]);
            }

            map.putIfAbsent(key.toString(),new ArrayList<>());
            map.get(key.toString()).add(s);

        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
}
