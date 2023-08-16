public class kadanes_algo {

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }

        if(ms==0){
            ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                ms=Math.max(ms,arr[i]);
            }
        }
        System.out.println(ms);
    }

    public static void main(String args[]){
        int arr[]={-2,9};
        int num[]={-1,-1,-2,-3};
        kadanes(arr);

    }
}
