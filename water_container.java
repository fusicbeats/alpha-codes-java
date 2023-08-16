import java.util.*;
public class water_container {

    // Brute Force
    public static void water(ArrayList<Integer> height){
        int maxWater=0;
        int currWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int wd = j-i;
                currWater=ht*wd;
                maxWater=Math.max(currWater,maxWater);
            }
        }
        System.out.println(maxWater);
    }

    // Two pointer approach
    public static void water_two_pointer(ArrayList<Integer>height){
        int maxWater=0;
        int lp =0;
        int rp = height.size()-1;

        while(lp<rp){
            // Calculate water area
            int ht = Math.min(height.get(lp),height.get(rp));
            int wd = rp-lp;
            int currWater = ht*wd;
            maxWater = Math.max(maxWater,currWater);

            // Update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }

        }
        System.out.println("Total water stored is: "+maxWater);
    }

    public static void main(String args[]){
        ArrayList<Integer> height=  new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // water(height);
        water_two_pointer(height);
    }
}
