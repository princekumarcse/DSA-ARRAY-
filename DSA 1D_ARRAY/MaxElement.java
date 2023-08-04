/*Q3: Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 65
*/
public class MaxElement{
    public static void main(String args[]){
        int arr[]={34,21,54,65,43};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.print(max);
        
    }
}