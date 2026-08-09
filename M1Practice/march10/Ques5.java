package M1Practice.march10;

public class Ques5 {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listeh";

        if(s1.length() != s2.length())
        {
            System.out.println("Not Anagram");
            return;
        }

        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            int idx = s2.indexOf(c);

            if(idx == -1)
            {
                System.out.println("not Anangram");
                return;
            }

            s2 = s2.substring(0,idx) + s2.substring(idx+1);
        }

        System.out.println("Anagrams");


    }


    
}
