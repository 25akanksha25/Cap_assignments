package Questions;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "Java Programming";

        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == ' ')
            {
                idx = 0;
                sb.append(c);
            }
            else
            {
                if(idx % 2 == 0)
                {
                    sb.append(Character.toUpperCase(c));
                }
                else
                {
                    sb.append(Character.toLowerCase(c));
                }
                idx++;
            }
        }

        System.out.println(sb.toString());
    }
    
}
