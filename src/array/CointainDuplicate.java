package array;
import java.util.HashSet;
public class CointainDuplicate {
    public static Boolean cointainDuplicate(int[] num){
        HashSet<Integer> dopingNo=new HashSet<>();
        for (int i=0;i< num.length;i++){
            if (dopingNo.contains(num[i])){
                return true;
            }
            dopingNo.add(num[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] num={1,3,25,21};
        Boolean ans=cointainDuplicate(num);
        System.out.println(ans);




    }
}
