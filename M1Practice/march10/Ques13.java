package M1Practice.march10;

public class Ques13 {
    public static void main(String[] args) {
        String str = "HellO";

        int upper = 0;
        int lower = 0;

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z')
            {
                upper++;
            }
            else
            {
                lower++;
            }
        }

        if(upper > lower)
        {
            str = str.toUpperCase();
        }
        else
        {
            str = str.toLowerCase();
        }

        System.out.println(str);
    }
    
}
