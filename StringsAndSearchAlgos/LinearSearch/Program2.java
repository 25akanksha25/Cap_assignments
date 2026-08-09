package StringsAndSearchAlgos.LinearSearch;

import java.util.Scanner;

public class Program2 {
    public static String FirstSentence(String word,String sentence[])
    {
        for(String str : sentence)
        {
            for(String s : str.split(" "))
            {
                if(s.equals(word))
                {
                    return str;
                }
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = sc.nextInt();
        sc.nextLine();
        String sentence[] = new String[n];

        for(int i=0;i<n;i++)
        {
            sentence[i] = sc.nextLine();
        }

        String ans = FirstSentence(word, sentence);
        System.out.println("Word in sentence : "+ans);


    }
    
}
