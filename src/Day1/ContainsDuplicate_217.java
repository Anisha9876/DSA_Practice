package Day1;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        if(set.size()== nums.length){
            System.out.println(false);
            return;
        }


        System.out.println(true);

    }

}
