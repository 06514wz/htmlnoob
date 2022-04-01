package threeone;

public class fourteen {
    public static void main(String[] args) {
        for(int number=100;number<=999;number++){
            int a,b,c,sun;
            a=number%10;
            b=number/10%10;
            c=number/10/10%100;
            sun=a*a*a+b*b*b+c*c*c;
            if(sun==number){
                System.out.println(number+"为水花仙数");
            }
            number=number+0;
        }
    }
}
