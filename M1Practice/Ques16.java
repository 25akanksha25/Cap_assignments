package M1Practice;

public class Ques16 {
    public static void main(String[] args) {
        int n = 12;
        int arr[] = new int[10];

        int idx = 0;
        for(int i=1;i<=10;i++)
        {
            arr[idx++] = n * i;
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n"+sum);
    }
    
}
