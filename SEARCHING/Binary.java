import java.util.Scanner;
public class Binary{
    public static int BinarySearch(int arr[],int target){
    int low=0, high=arr.length-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int target=sc.nextInt();
        int Result=BinarySearch(arr,target);
        if(Result==-1){
            System.out.println("Index Not Found");
        }else {
            System.out.println("Index Number is: "+Result);
        }
    }
}