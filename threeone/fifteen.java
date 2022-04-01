package threeone;

import java.util.Scanner;

public class fifteen {
        public static void main(String[] args) {
            int n1 = 1, n2 = 1, n3, m;
            Scanner in = new Scanner(System.in);
            m = in.nextInt();
            for (int i = 3; i <= m; i++) {
                n3 = n2;
                n2 = n1 + n2;
                n1 = n3;
                System.out.println(n2 + ",");
            }
        }
    }

