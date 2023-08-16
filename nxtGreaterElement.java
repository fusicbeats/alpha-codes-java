import java.util.*;
public class nxtGreaterElement {

    public static void nextGrtEl(int arr[],int nxtGrt[]){
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGrt[i]=-1;
            }else{
                nxtGrt[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String args[]){
      int arr[]={6,8,0,1,3};
      int nxtGrt[]=new int[arr.length];  
      nextGrtEl(arr, nxtGrt);

      for(int i=0;i<arr.length;i++){
        System.out.print(nxtGrt[i]+" ");
      }
    }
}
