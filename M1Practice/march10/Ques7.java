package M1Practice.march10;

public class Ques7 {
    public static void main(String[] args) {
        String str = "CsharpstarZ";

        String ans = "";

        for(char i : str.toCharArray())
        {
            if((ans.indexOf(i)) == -1)
            {
                ans +=i;
            }
            
        }

        System.out.println(ans);
        
        


    }
    
}
