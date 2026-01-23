package Array;

public class Lt_1920_BuiltArrayPermutation {
    public static void main(String[] args) {
        int arr[]={1,4,6,3,5,0,2};
        int res[]=new int[arr.length];

            for(int i=0;i<arr.length;i++){
                res[i]=arr[arr[i]];
            }

        for(int i:res){
            System.out.print(i+" ");
        }


            }
}
