package Array;

public class Finding_SmallestEL {
    public static void main(String[] args) {
        int arr[]={2,1,3,45,3,56,77};
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest number "+smallest);
    }
}
