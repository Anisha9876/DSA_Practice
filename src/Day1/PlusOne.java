package Day1;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={1,2,3,9};
        for (int i = digits.length - 1; i >= 0; i--) {

            // no carry needed
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;

            }

            // handle carry
            digits[i] = 0;
        }

        // all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(digits));
    }
}
