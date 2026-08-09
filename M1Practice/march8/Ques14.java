package M1Practice.march8;

public class Ques14 {
    public static void main(String[] args) {
        int m = 100;
        int n = 160;

        int ans = 0;

        for(int i=m;i<=n;i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                ans += i;
            }
        }
        System.out.println(ans);
    }
    
}
