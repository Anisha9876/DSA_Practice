package String;

public class Lt_344_ReverseString {
    public static void main(String[] args) {
        char[] str={'a','n','i'};

        char temp;
        for(int i=0;i<str.length/2;i++)
        {
            temp=str[i];
            str[i]=str[str.length-i-1];
            str[str.length-i-1]=temp;

        }
        for(char c:str){
            System.out.print(c+" ");
        }

    }
}
