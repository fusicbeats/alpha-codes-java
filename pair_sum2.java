import java.util.*;
public class pair_sum2 {

    public static boolean pairSum (ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0; i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp = bp;

        while(lp!=rp){
            // Case 1
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(lp+","+rp);
                return true;
            }

                // Case 2
            else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1) % n;
            }
            
            // Case 3
            else{
                rp=(rp+n-1) % n;
            }
        }
        System.out.println("Target not found");
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // 11,15, 6, 8, 9, 10 - Sorted and Rotated 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;
        pairSum(list, target);
    }
}
