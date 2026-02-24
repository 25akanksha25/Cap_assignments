package Questions;

public class SelectiveReverse {
    public static void main(String[] args) {
        String str = "I love java programming very much";

        int i=0;
        StringBuilder sb = new StringBuilder();
        for(String s : str.split(" "))
        {
            if(i % 2 == 0)
            {
                sb.append(new StringBuilder(s).reverse());
            }
            else
            {
                sb.append(s);
            }
            i++;
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
