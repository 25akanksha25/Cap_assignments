package M1Practice.march10;

public class Ques6 {
    public static boolean palindrome(String s)
    {
        int l = 0;
        int h = s.length() - 1;

        while(l < h)
        {
            if(s.charAt(l) != s.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "this is level 71";

        int count = 0;
        for(String s : str.split(" "))
        {
            if(palindrome(s))
            {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
