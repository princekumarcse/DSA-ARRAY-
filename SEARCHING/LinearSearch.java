class LinearSearch{
    public static void main(String args[]){
        int arr[]={2,4,10,12,14,20,27,30};
        int target=27;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index==0){
            System.out.println("Index Not found");
        }else {
            System.out.println("Index Number is: "+index);
        }
    }
}