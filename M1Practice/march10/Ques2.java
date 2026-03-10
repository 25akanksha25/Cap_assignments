package M1Practice.march10;

public class Ques2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1};

        int max = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
    
}
