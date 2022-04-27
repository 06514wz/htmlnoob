package foure;

public class four {
    public static void main(String[] args) {
        int[] arr = {12,45,98,73,60};
        //定义一个变量，用于保存最大值
        int max = arr[0];
        //设max的最大值为arr数组中的0

        for(int x = 1;x<arr.length;x++){
            //与数组中剩余的数据逐个对比，每次将最大值保存在变量中
            if(arr[x]>max){
                max = arr[x];
            }
        }
        System.out.println("max:"+max);
    }
}
