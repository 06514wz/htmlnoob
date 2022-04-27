package foure;

import java.util.Scanner;

public class homeworkb {
    public static void main(String[] args) {
        //for(int i=1;i<4;i++){
            System.out.println("请输入数字：");
            Scanner sc=new Scanner(System.in);
            int num1=sc.nextInt();

        //}
            int num2=sc.nextInt();
            int num3=sc.nextInt();
        int max = (num1< num2) ? num2 : num1;
        max = (max < num3) ? num3 : max;
        int mbx=(num1<num2)?num1:num2;
        mbx=(mbx<num3)?num3:mbx;
        int mcx = (num1< num2) ? num2 : num1;
        mcx = (mcx < num3) ? mcx : num3;
        System.out.println(max+">"+mbx+">"+mcx);
    }
}


