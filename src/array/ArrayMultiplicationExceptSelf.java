package array;
import java.util.Arrays;

public class ArrayMultiplicationExceptSelf {
    public static int[] arrayMultiplicationExceptSelf(int[] nums){

        int len=nums.length;
        int[] left=new int[len];

        left[0]=1;
        for (int i =1;i<len;i++){
                left[i]=left[i-1]*nums[i-1];
        }

        int right=1;
        for (int i=len-1;i>=0;i--){
            left[i]=left[i]*right;
            right=right*nums[i];
        }
        return left;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(arrayMultiplicationExceptSelf(nums)));

    }
}
