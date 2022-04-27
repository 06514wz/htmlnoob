package foure;

import java.util.Random;

public class seven {
    public static void main(String[] ars) {
        Random se=new Random();
        int arr[] = new int[10];
        int count=0;
        for(int x=0;x<10;x++) {
            int num = se.nextInt(10) + 1;
            arr[num] = se.nextInt();
            count+=arr[num];
        }
        System.out.println("该选手的总分为："+count);
        System.out.println("该选手的平均分为："+count/10);
    }
}
