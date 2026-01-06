package array;

import java.util.HashMap;

public class AlienLanguageDecode {
    public static Boolean alienLanguageDecode(String[] words,String order){
        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }

        for (int i=0;i<words.length-1;i++){
            for (int j=0 ; j<words[i].length();j++){
                if (j>words[i+1].length()){
                    return false;
                }
                if (words[i].charAt(j)!=words[i+1].charAt(j)){
                    int currLetter=map.get(words[i].charAt(j));
                    int nextLetter=map.get(words[i+1].charAt(j));
                    if (currLetter>nextLetter){
                        return false;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        String order="wertf";
        String[] words={"wrt","wrf","er","ftt","rftt"};
        System.out.println(alienLanguageDecode(words,order));
    }
}
