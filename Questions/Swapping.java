package Questions;

public class Swapping {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1,6};
        int n = arr.length;

        for(int i=0;i<n-2;i+=2)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }


        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    
}
