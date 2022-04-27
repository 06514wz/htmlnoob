package foure;

import java.util.Random;

public class homeworka {
    public static void main(String[] args) {
        Random sc=new Random();
        int number=sc.nextInt(900)+100;
        int a,b,c;
        a=number%10;
        b=number/10%10;
        c=number/10/10%100;
        System.out.println("所获取的随机数为："+number);
        System.out.println("它的百位数为："+c);
        System.out.println("它的十位数为："+b);
        System.out.println("它的个位数为："+a);
    }
}
