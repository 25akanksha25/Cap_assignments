package Capgemini_Questions;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        HashMap <Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
    }
    
}
