/*Q5: Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column. Printing can
be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
*/
import java.util.Scanner;
public class PrintMiddleRowCol{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i,j,m,n;
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
       System.out.println("The Element of Middle Row and Middle Column: ");
       for(i=0;i<m;i++)
          System.out.print(arr[i][m/2]+" ");
        for(j=0;j<m;j++){
            if(j==m/2)
            continue;
            System.out.print(arr[m/2][j]+" ");
        }

    }
}
