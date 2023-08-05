/*Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
in any order.
*/
import java.util.Scanner;
public class PrintBothDiagonal{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the Row:");
        m=sc.nextInt();
        System.out.println("Enter the Column:");
        n=sc.nextInt();
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
        System.out.println("Both Diagonal Elements are: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i+j==m-1){
                    System.out.print(arr[i][j]+" ");
                }else if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}