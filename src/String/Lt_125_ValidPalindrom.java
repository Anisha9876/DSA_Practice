package String;

public class Lt_125_ValidPalindrom {
    public static void main(String[] args) {
        String in="A man, a plan, a canal: Panama";
        String str = in.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
