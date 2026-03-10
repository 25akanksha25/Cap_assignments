package M1Practice.march10;

public class Ques9 {
    public static void main(String[] args) {
        String str = "nrfzh";

        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == 'z')
            {
                ans += (char)('a' + 2);
            }
            else
            {
                ans += (char)(c + 3);
            }
        }
        System.out.println(ans);
    }
    
}
