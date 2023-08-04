/*Q2: Write a program to traverse over the elements of the array using for each loop and print all even
elements.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 34 54
*/
public class PrintEvenElement{
    public static void main(String args[]){
        int arr[]={34,21,54,65,43};
        for(int x:arr){
            if(x%2==0){
                System.out.print(x+" ");
            }
        }

    }
}