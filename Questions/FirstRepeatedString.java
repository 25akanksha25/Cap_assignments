package Questions;

public class FirstRepeatedString {
    public static void main(String[] args) {
        String arr[] = {"Java","python","c++","Java","c","python"};
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }

    }
    
}
