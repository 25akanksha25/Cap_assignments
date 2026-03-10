package M1Practice.march10;

public class Ques15 {
    public static void main(String[] args) {
        String str = "localization";
        String ans = "";

        if(str.length() > 10)
        {
            char f = str.charAt(0);
            char l = str.charAt(str.length() - 1);

            int len = str.length() - 2;

            ans = ans + f + len + l;
        }

        System.out.println(ans);
    }
    
}
