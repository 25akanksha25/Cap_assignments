package M1Practice.march10;

public class Ques10 {
    public static void main(String[] args) {
        int arr[] = {5,0,7,6};

        int idx = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                arr[idx++] = arr[i];
            }
        }

        while(idx != arr.length)
        {
            arr[idx++] = 0;
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    
}
