package M1Practice.march8;

public class Ques13 {
    public static void main(String[] args) {
        int a = 70;
        int b = 100;
        int max = 0;
        int maxE = 0;

        for(int i=a;i<=b;i++)
        {
            int count = 0;
            if(i % 2 == 0)
            {
                int ans = i;
                while(ans % 2 == 0)
                {
                    ans /= 2;
                    count++;
                }
            }

            if(count > maxE)
            {
                maxE = count;
                max = i;
            }

        }
        System.out.println(max);
    }
    
}
