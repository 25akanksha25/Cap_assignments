package StringsAndSearchAlgos.StringBuffer;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];

        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }

        StringBuffer sb = new StringBuffer();

        for(String str : s)
        {
            sb.append(str);
        }

        System.out.println(sb.toString());
    }
    
}
