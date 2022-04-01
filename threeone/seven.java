package threeone;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int number = sc.nextInt();
        switch(number){
            case 3:
            case 4:
            case 5:
                System.out.println(number+"月为春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(number+"月为夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(number+"月为秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(number+"月为冬天");
                break;
                default:
                    System.out.println("你输入的数据有误！！！");
        }
    }
}

