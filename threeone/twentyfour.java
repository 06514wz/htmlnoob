package threeone;

import java.util.Random;
import java.util.Scanner;

public class twentyfour {
    public static void main(String[] args) {
        Random sc=new Random();
        int number=sc.nextInt(100)+1;
       nnn/*标签*/: for(int i=0;i<=1;){

            System.out.println("请输入数字：");
            Scanner se=new Scanner(System.in);
            int num=se.nextInt();

            if(num<number) {
                System.out.println("你猜的数字小了");
            }else if(num>number) {
                System.out.println("你猜的数字大了");

            }else/*(num==number)*/{
                System.out.println("你猜对了！");
              //continue nnn;/*只能退出本层循环*/
               break nnn;
            }
        }
    }
}
