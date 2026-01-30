package StringsAndSearchAlgos.StringBuilder;

import java.util.HashSet;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray())
        {
            if(!set.contains(c))
            {
                sb.append(c);
                set.add(c);
            }
        }

        System.out.println(sb.toString());

        

    }
}
