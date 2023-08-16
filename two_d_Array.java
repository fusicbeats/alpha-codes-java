import java.util.*;
public class two_d_Array {
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }
}
