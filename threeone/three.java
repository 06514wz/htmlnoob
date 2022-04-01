package threeone;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if(number%2==0){
    System.out.println(number+"为偶数");
}
    else
    System.out.println(number+"为奇数 ");
        System.out.println("结束");
    }
}
