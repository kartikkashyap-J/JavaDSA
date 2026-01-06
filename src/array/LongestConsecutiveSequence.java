package array;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] nums){

        if (nums.length==0){
            return 0;
        }
        HashSet<Integer> numSet=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            numSet.add(nums[i]);
        }
        int longestSeq=1;
        for (Integer num:numSet){
            if (numSet.contains(num-1)){
                continue;
            }
            else {
                int currNumber=num;
                int currSub=1;
                while (numSet.contains(currNumber+1)){
                    currNumber++;
                    currSub++;
                }
                longestSeq=Math.max(longestSeq,currSub);
            }
        }
        return longestSeq;

    }
    public static void main(String[] args){
        int[] nums={1,23,3,4,5,6,7,32,4,1,0};
        System.out.println(longestConsecutiveSequence(nums));
    }
}
