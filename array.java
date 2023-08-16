public class array{
    public static void subArraySum(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int prefix[]=new int[arr.length];

        // calculate prefix array
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                
                sum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                System.out.println(sum);
               if(sum>max){
                max=sum;
               }if(sum<min){
                min=sum;
               }
                
            }
              
        } 

        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        subArraySum(arr);
       
    }
        
}