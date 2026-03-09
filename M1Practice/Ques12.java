package M1Practice;

public class Ques12 {
    public static void main(String[] args) {
        int a = 16;
        int b = 20;
        int c = 2;

        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("wrong value of c");
                break;
        }
        
    }
    
}
