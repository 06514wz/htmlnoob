package foure;

import java.util.Scanner;

public class homeworkf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        System.out.println(number+"素数因子是：");

        int i=2;
        while(i<=number){
            if(number % i ==0){
                number = number/i;
                System.out.println(i);
            }
            else{
                i++;
            }
        }
    }
}
