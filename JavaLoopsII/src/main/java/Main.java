import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        int k = 1;

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 1; j <= n; j++) {
                sum = a;
                for (int m = 1; m <= j; m++) {
                    sum += k * b;
                    k = k * 2;

                }
                System.out.print(sum + " ");
                sum = 0;
                k = 1;


            }
            System.out.println();
        }
        in.close();
    }
}

