package foure;

import java.util.Scanner;

public class   homeworkc {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个整数:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a&&a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b) {
            System.out.println(+a);
            System.out.println(+b);
            System.out.println(+c);}
             if(a*a==b*b+c*c) {
                 int m = b * c / 2;
                 System.out.println("该直角三角形面积为：" + m);
             }
                else if (b * b == c * c + a * a) {
                 int x = a * c / 2;
                 System.out.println("该直角三角形面积为：" + x);
             }
        else if(c * c == a * a + b * b) {
                        int  y = b * a / 2;
                         System.out.println("该直角三角形面积为：" + y);

                     }

            else{

                System.out.println("你输入的三边无法组成直角三角形，请重新输入！");
            }
    }
}