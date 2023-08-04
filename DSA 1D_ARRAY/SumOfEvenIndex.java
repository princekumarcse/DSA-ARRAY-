/*Q1: Write a program to print the sum of all the elements present on even indices in the given array.
Input 1: arr[] = {3,20,4,6,9}
Output 1: 16
*/
public class SumOfEvenIndex{
    public static void main(String args[]){
         int[] arr = {3,20,4,6,9};
   	    int i = 0, sum = 0;
        while (i < arr.length) {
         sum += arr[i];
         i += 2;
     }
        
        System.out.println("Sum of Even Index Element is: "+sum);
    }
}