package Demo;

import java.util.Scanner;
public class hesha {
    public static void main(String[] args){
        int height1,height2,height3;
        Scanner hs=new Scanner(System.in);
        height1=hs.nextInt();
        height2=hs.nextInt();
        height3=hs.nextInt();
        int a=height1>height2?height1:height2;
        int b=a>height3?a:height3;
        System.out.println("maxheight:"+b);

    }
}
