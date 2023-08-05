/*Q4:write a program to find the largest element of a given 2D array of integers.*/
import java.util.Scanner;
public class FindLargest{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i,j;
        System.out.println("Enter The Row: ");
        int m=sc.nextInt();
        System.out.println("Enter The Column: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the Martix Element:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is :");
        for(i=0;i<m;i++){
            
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int large=Integer.MIN_VALUE;
        
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(large<arr[i][j]){
                    large=arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is: "+large);

    }
}