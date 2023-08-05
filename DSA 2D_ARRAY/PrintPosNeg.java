/*Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0.
*/
import java.util.Scanner;
public class PrintPosNeg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Row: ");
        int  m=sc.nextInt();
        System.out.println("Enter Number of Column: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int pos=0,neg=0,odd=0,even=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>0)
                pos++;
                if(arr[i][j]<0)
                neg++;
                if((arr[i][j]%2)==0)
                even++;
                if((arr[i][j]%2)%2!=0)
                odd++;
            }
        }
       System.out.println("Number of Positives= "+pos);
       System.out.println("Number of Negatives= "+neg);
       System.out.println("Number of Even= "+even);
       System.out.println("Number of Odd= "+odd);

    }
}