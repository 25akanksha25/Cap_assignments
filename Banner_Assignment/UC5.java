package Banner_Assignment;
import java.util.*;
public class UC5 {

    public static HashMap<Character,String[]> createMap()
    {
        HashMap<Character,String[]> map = new HashMap<>();

        map.put('O',new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        map.put('P',new String[]{
            "******   ",
            "**    ** ",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        });

        map.put('S',new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            "  ***    ",
            "     **  ",
            "      ** ",
            "     **  ",
            " *****   "
        });

        return map;

    }

    public static void displayBanner(HashMap<Character,String[]>map, String word)
    {
       
        int height = map.get('O').length;
        for(int i=0;i<height;i++)
        {
            String line = "";
            for(char ch:word.toCharArray())
                {
                    String[] pattern = map.get(ch);
                    line += pattern[i] + " ";
                }
            System.out.println(line);
        }
        
        

    }

    public static void main(String[] args) {
        HashMap<Character,String[]> map = createMap();
        String word = "OOPS";
        displayBanner(map,word);
    }
    
}
