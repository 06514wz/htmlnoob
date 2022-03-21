package Demo;

public class bmi {
    public static void main(String[] args){
        double shengao=1.88;
        int tizhong=75;
        double BMI;
        BMI=tizhong/(shengao*shengao);
        System.out.println("您的身高为"+shengao);
        System.out.println("您的体重为"+tizhong);
        System.out.println("您的BMI值为"+BMI);
        System.out.println("您的体重属于：");
        if(BMI<18.5)
        {
            System.out.println("体重过轻");
        }
        else if(BMI>18.5&&BMI<24.9)
            System.out.println("正常范围");
        else if(BMI>=24.9&&BMI<29.9)
            System.out.println("体重过轻");
        else
            System.out.println("肥胖");
    }



}
