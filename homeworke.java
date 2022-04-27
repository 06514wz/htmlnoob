package foure;

import java.util.Scanner;

public class homeworke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=sc.nextInt();
        int Primenumber;
        Primenumber=num;
        for(;Primenumber>0;Primenumber--){
            if(Primenumber%2!=0)
            {
                System.out.println(num+"的素数因子如下："+Primenumber);
            }
        }
    }
}


