import java.util.*;
//time complexity O(n^2)
//space complexity O(1)
public class SelectionSort{

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={20,50,12,17,19,25,97,16};
        selectionSort(arr);
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}