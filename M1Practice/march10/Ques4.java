package M1Practice.march10;

public class Ques4 {
    public static void main(String[] args) {
        String str = "abcddbbcccc";
        int max = 0;
        char ans = ' ';

        for(int i=0;i<str.length();i++)
        {
            int count = 0;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(j) == str.charAt(i))
                {
                    count++;
                }
            }

            if(count > max)
            {
                max = count;
                ans = str.charAt(i);
            }
        }

        System.out.println(ans);



    }
    
}
