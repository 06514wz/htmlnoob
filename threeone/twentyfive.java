package threeone;

import java.util.Scanner;

public class twentyfive {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int x = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int y = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int z = sc.nextInt();
        int max = (x < y) ? y : x;
        max = (max < z) ? z : max;
        System.out.println("max:" + max);

    }
}