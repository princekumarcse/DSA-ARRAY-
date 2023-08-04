/*Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
its just left and just right neighbor.
Input 1: arr[] = {1,3,2,6,5}
Output 1: 6
*/
public class PickElement{
    public static int FindPick(int[] arr){
        int n= arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1, 3, 2, 6, 5};
        int firstpeak=FindPick(arr);
        if(firstpeak!=-1){
            System.out.println("First Peak Element: "+firstpeak);
        }else{
            System.out.println("No peak element found in the array.");
        }
    }
}

