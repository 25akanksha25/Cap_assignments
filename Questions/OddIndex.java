package Questions;


public class OddIndex {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;

        for(int i=n-1;i>=2;i--)
        {
            if(i % 2 == 0)
            {
                int temp = arr[i];
                arr[i] = arr[i-2];
                arr[i-2] = temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }



    }
    
}
