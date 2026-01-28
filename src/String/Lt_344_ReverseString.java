package String;

public class Lt_344_ReverseString {
    public static void main(String[] args) {
        String str="anisha";
        StringBuilder rev=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
    }
}
