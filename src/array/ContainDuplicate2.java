package array;

import java.util.HashSet;

public class ContainDuplicate2 {
    public static Boolean containDuplicate2(int[] nums,int k){
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if (set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums={1,1,3,4,1};
        int k=3;
        System.out.println(containDuplicate2(nums,k));
    }
}
