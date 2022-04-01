package threeone;

//import java.util.Scanner;

public class twentytwo {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("请选择你想要的座位：");*/
        System.out.println("剧院可售座位：");
        for(int i=1;i <= 4;i++){
            for(int x=1;x <=10;x++){
                if(x==1||x==10) {
                   // System.out.println("该座位无法选中，请重新选择！");
                    continue;/*结束本次循环*/
                }else{
                        System.out.println("第" + i + "行第" + x + "列可出售");
                    }
            }
        }
    }
}
