package Questions;

public class BalancedSplit {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,10};
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        if(sum % 2 != 0)
        {
            System.out.println("No");
        }
        else
        {
            sum = sum / 2;
            int total = 0;
            for(int i=0;i<n;i++)
            {
                total += arr[i];
                if(total == sum)
                {
                    System.out.println("Yes");
                    return;
                }

            }
            System.out.println("No");
        }
        
        


    }
    
}
