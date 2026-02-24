package Questions;

import java.util.ArrayList;
import java.util.List;

public class RotationPalindrome {
    public static void main(String[] args) {
        String str = "aab";
        int k = str.length()-1;

        List<String> list = new ArrayList<>();
        for(int i=0;i<=k;i++)
        {
            String sub = str.substring(i,str.length()) + str.substring(0,i);
            // list.add(sub);
            if(isPalindrome(sub))
            {
                System.out.println(sub+" Yes");
                break;
            }
            else
            {
                System.out.println(sub+" No");
            }
        }
        // System.out.println(list);

        
    }


    public static boolean isPalindrome(String a)
    {
        boolean flag = true;
        
            int left = 0;
            int right = a.length()-1;

            while(left < right)
            {
                if(a.charAt(left) != a.charAt(right))
                {
                    flag = false;
                    break;
                }

                left++;
                right--;
            }

            return flag;


    }
    
}
