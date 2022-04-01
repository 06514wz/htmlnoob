package threeone;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();
        if(x<60){
            System.out.println("钢笔");
        }else if(x>60&&x<=80){
            System.out.println("书包和钢笔");
        }else if(x>80&&x<=90) {
            System.out.println("书包，钢笔和铅笔盒");
        }else if(x>90&&x<=100) {
            System.out.println("书包，钢笔，铅笔盒，足球");
        }else{
            System.out.println("输入错误！！！");
        }
        System.out.println("结束");
    }
}
