/*Q2: write a program to print the elements above the secondary diagonal in a user inputted
square matrix.
*/
import java.util.Scanner;
public class SumOfDiagonal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Row: ");
        int  m=sc.nextInt();
        System.out.println("Enter Number of Column: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int i,j;
        System.out.println("Enter the Matrix Element: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Element of Secondary Elememts: ");
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i+j<m-1)
                System.out.println(arr[i][j]+" ");
            }
        }
    }
}