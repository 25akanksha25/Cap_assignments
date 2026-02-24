package Questions;

public class RemoveMirror {
    public static void main(String[] args) {
        String str = "xyyb";

        if(str.length() % 2 != 0)
        {
            System.out.println(str);
        }

        int mid = str.length() / 2;

        String first = str.substring(0,mid);
        String sec = str.substring(mid);

        String ans = "";
        for(int i = first.length()-1;i>=0;i--)
        {
            ans+=first.charAt(i);
        }

        if(ans.equals(sec))
        {
            System.out.println(first);
        }
        else
        {
            System.out.println(str);
        }

        

    }
    
}
