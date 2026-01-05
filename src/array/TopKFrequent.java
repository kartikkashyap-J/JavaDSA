package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums,int k){
        if (k==nums.length){
            return nums;
        }

        HashMap<Integer ,Integer> map=new HashMap<>();

        for (int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        Queue<Integer> heap=new PriorityQueue<>((a,b)
                ->map.get(a)-map.get(b));

        for (int n:map.keySet()){
            heap.add(n);
            if (heap.size()>k){
                heap.poll();
            }
        }
        int[] ans=new int[k];
        for (int i =0;i< k;i++){
            ans[i]=heap.poll();
        }
        return ans;
    }
    public static void main(String[] agrs){
        int[] nums={1,2,3,3,3,1,3,5,5,5};
        System.out.println(Arrays.toString(topKFrequent(nums,2))  );
    }
}
