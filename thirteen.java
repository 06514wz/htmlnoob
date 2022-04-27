package foure;

public class thirteen {
    public static void main(String[] args) {
        int arr[] = {19, 28, 37, 46, 50};
        //循环遍历数组，需要初始化定义两个索隐变量。
        System.out.println("反转前");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.println("反转后：");
        for (int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
