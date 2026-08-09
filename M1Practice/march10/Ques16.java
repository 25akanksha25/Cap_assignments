package M1Practice.march10;

public class Ques16 {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,5,6};

        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= 0)
            {
                count ++;
            }
        }
        int mid;
        if(count % 2 == 0)
        {
            mid = count / 2 - 1;
        }
        else
        {
            mid = count / 2;
        }

        int posC = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >= 0)
            {
                if(posC == mid)
                {
                    System.out.println(arr[i]);
                    return;
                }
                posC++;
            }
        }
    }
    
}
