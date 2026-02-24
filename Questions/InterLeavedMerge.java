package Questions;

public class InterLeavedMerge {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "XYZ";

        StringBuilder sb = new StringBuilder();
        int a = s1.length();
        int b = s2.length();    

        int min = Math.min(a, b);

        for(int i=0;i<min;i++)
        {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }

        if(a==min)
        {
            sb.append(s2.substring(min));
        }
        else
        {
            sb.append(s1.substring(min));
        }

        System.out.println(sb.toString());
        

    }
    
}
