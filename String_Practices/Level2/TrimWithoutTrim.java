package String_Practices.Level2;
import java.util.Scanner;

public class TrimWithoutTrim 
{

    public static int[] findTrimIndexes(String text) 
    {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ')
        { 
            start++;
        }
        while (text.charAt(end) == ' ') 
        {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) 
        {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = findTrimIndexes(text);
        String custom = customSubstring(text, idx[0], idx[1]);

        System.out.println("Custom Trim: " + custom);
        System.out.println("Built-in Trim Equal: " + custom.equals(text.trim()));
    }
}

