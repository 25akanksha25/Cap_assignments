package M1Practice.march10;

public class Ques12 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,6,7,8};

        int c  = 1;
        int sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            int diff = c - arr[i];
            sum += diff;
            c++;
        }

        System.out.println(sum + c);
    }
    
}
