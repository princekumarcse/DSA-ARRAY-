import java.util.*;
import java.io.*;
public class BubbleSort{

    public static void bubbleSort(int [] arr ){
        
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }    
            }
            if(swapped==false){//!swapped
                break;
            }                
        }
    }

    public static void main(String args[]){
        int arr[]={20,50,10,13,45,100};
        bubbleSort(arr);
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(arr));
    }
}