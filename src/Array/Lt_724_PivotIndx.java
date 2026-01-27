package Array;

public class Lt_724_PivotIndx {
    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        int rSum=0,lSum=0;


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                rSum=rSum+arr[j];
            }
            for(int k=i-1;k>=0;k--){
                lSum=lSum+arr[k];
            }
            if(lSum==rSum){
                System.out.println("Pivot Index is = "+i);
                break;
            }
            rSum=0;
            lSum=0;

        }


    }
}
