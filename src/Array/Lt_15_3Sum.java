package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lt_15_3Sum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> list=new ArrayList<>();
       int left,right,num,sum=0;
       int result;
       Arrays.sort(arr);
       for(int i=0;i< arr.length-2;i++){
           if (i > 0 && arr[i] == arr[i - 1]) continue;
           left=i+1;
         right=arr.length-1;
           while(right>left){
               result=arr[i]+arr[right]+arr[left];
               if(result==0){
                   list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                   while (left < right && arr[left] == arr[left + 1]) left++;
                   while (left < right && arr[right] == arr[right - 1]) right--;
                   left++;
                   right--;

               }
               else if(result<0){
                   left++;

               }
               else{
                   right--;
               }


           }

       }
        System.out.println(list);



    }
}
