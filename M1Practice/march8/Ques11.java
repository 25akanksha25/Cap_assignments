package M1Practice.march8;

public class Ques11 {
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';

        String ans = "";
        for(char c : str.toCharArray())
        {
            if(c == ch1)
            {
                ans += ch2;
            }
            else if(c == ch2)
            {
                ans += ch1;
            }
            else
            {
                ans += c;
            }

        }

        System.out.println(ans);
    }
    
}
