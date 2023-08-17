import java.util.*;
import java.io.*;
//time complexity =O(n^2)
//Space Complexity =o(1)
public class InsertionSort{

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={20,40,11,19,27,45};
        insertionSort(arr);
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }
}