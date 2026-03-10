package M1Practice.march10;

public class Ques3 {
    public static void main(String[] args) {
        String str = "101101110";
        int count = 0;
        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == '1')
            {
                count++;
            }
            if((c == '0' && count != 0) || (c == '1' && i == str.length() - 1))
            {
                char d = (char)('A' + count - 1);
                ans += d;
                count = 0;
            }
        }

        System.out.println(ans);

    }
    
}
