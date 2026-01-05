package hashmap;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s){
        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",1000);
        map.put("XC",1000);
        map.put("CD",1000);
        map.put("CM",1000);

        int sum=0;
        int i=0;

        while (i<s.length()){
            if (i<s.length()-1){
                String twoNumber=s.substring(i,i+2);
                if (map.containsKey(twoNumber)){
                    sum+=map.get(twoNumber);
                    i=i+2;
                    continue;
                }

            }
            String oneNumber=s.substring(i,i+1);
            sum+=map.get(oneNumber);
            i+=1;
        }
        return sum;
    }
    public static void main(String[] args){
        String s="CIII";
        System.out.println(romanToInteger(s));
    }
}
