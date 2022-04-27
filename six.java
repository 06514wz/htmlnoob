package foure;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0;

        double arr[] = new double[10];/*申请十个空间*/
        System.out.println("请输入十个数字：");

        for (int i = 0; i< 10; i++) {
            arr[i] = sc.nextDouble();
            count += arr[i];
        }

        System.out.println("平均分是："+count/10);
        System.out.println("其中大于平均分的是：");

        for (int i = 0; i < 10; i++) {
            if (arr[i] > count/10) {
                System.out.print(arr[i]+"\t");/*"\t"为转义字符，代表tab,一个tab为8个空格*/
            }

        }
    }
}