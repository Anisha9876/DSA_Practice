package Array;

public class Finding_LrgEle {
    public static void main(String[] args) {
        int arr[]={1,45,23,12,47,0};
        int l=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }
        System.out.println("Maximum element "+l);
    }
}
