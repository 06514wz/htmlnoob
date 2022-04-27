package foure;

public class nineteen {
    public static void main(String[] args) {
        int sum, sum1 = 0, sum2, sum3 = 0, result;
        int arr[][] = {{23, 65, 43, 68}, {45, 99, 86, 80}, {76, 81, 34, 45}, {88, 64, 48, 25}};
       for (int x=1;x<arr.length;x++) {
            int temp;
            for (int y = arr[x].length - 1; y > 0; y--) {
                if (arr[x][y] > arr[x][y-1]) {
                    temp = arr[x][y];
                    arr[x][y] = arr[x][y-1];
                    arr[x][y-1] = temp;
                    for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                            System.out.println(arr[i][j]);
                        }
                    }
                }
            }
        }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j) {
                        sum = arr[i][j];
                        sum1 += sum;
                    }
                    if (i + j == 3) {
                        sum2 = arr[i][j];
                        sum3 += sum2;
                    }
                }
            }
            result = sum3 + sum1;
            System.out.println("该数组两条对角线之和为：" + result);
        }
    }




   /* int arr[][]={{23,65,43,68},{45,99,86,80},{76,81,34,45},{88,64,48,25}};
    int sum=0;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++) {
        if (i == j || i + j == 3) {
        sum += arr[i][j];
        }
        }
        }
        System.out.println("该二维数组的对角线之和:"+sum);
        }
        }*/