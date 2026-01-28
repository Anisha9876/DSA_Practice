package Array;

import java.util.ArrayList;
import java.util.List;

public class Lt_24_RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,7,7};
        int recent=arr[0];
        List<Integer> a=new ArrayList<>();
        a.add(arr[0]);
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==recent){
                a.add(arr[i]);

            }
            recent=arr[i];
        }

        System.out.println(a.size());
    }
}
