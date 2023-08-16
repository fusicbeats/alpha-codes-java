public class diagonal_sum {

    public static void diaSum(int arr[][]){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int j=n-i-1;
            sum+=arr[i][i];
            if(i!=j){
                sum+=arr[i][j];
            }

        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
                          {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        diaSum(matrix);

    }
}
