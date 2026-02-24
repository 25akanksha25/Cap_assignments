package Questions;

public class MaxDiff {
    public static void main(String[] args) {
        int arr[] = {2,7,3,1,9};
        int n = arr.length;

        int max = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(j > i)
                {
                    int diff = arr[j] - arr[i];
                    max = Math.max(diff,max);
                }
            }
        }

        System.out.println("Max : "+max);
    }
    
}
