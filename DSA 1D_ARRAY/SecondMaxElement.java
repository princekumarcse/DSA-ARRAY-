/*Q4: Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54
*/
public class SecondMaxElement{
    public static void main(String args[]){
        int arr[] = {34,21,54,65,43};
        int Second=arr[0];
        int largest=arr[0];
        for(int num:arr){
            if(num>largest){
                Second=largest;
                largest=num;
            }else if(num>Second){
                Second=num;
            }
        }
        System.out.print("Second Largest Element of Given Array is: "+Second);
    }
}