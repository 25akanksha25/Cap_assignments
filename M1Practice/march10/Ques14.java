package M1Practice.march10;

public class Ques14 {
    public static void main(String[] args) {
        int n = 321;

        int temp = n;
        int rev = 0;
        while(temp != 0)
        {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }

        if(rev % 10== 0)
        {
            System.out.println(rev / 10);
        }
        else
        {
            System.out.println(rev);
        }
    }
    
}
