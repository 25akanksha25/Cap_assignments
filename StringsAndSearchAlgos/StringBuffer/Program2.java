package StringsAndSearchAlgos.StringBuffer;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1_000_000;
        String s = "Hello";

        StringBuilder build = new StringBuilder();
        long startBuild = System.nanoTime();

        for (int i = 0; i < n; i++) {
            build.append(s);
        }

        long endBuild = System.nanoTime();
        long buildTime = endBuild - startBuild;



        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            buffer.append(s);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;



        System.out.println("String Builder : "+buildTime);
        System.out.println("String Buffer : "+bufferTime);


    }
    
}
