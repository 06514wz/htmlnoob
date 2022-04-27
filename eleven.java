package foure;

public class eleven {
    public static void main(String[] args) {
        int sort[] = {1,6,2,3,9,4,5,7,8};
        System.out.println("排序前：");
        for(int i=0;i<sort.length;i++){
            System.out.println(sort[i]+"");
        }
        System.out.println();


        for(int i=0;i<sort.length;i++){
            int temp;
            for(int j = sort.length-1;j>0;j--){
                if(sort[j]>sort[j-1]){
                    temp = sort[j];
                    sort[j] = sort[j-1];
                    sort[j-1] = temp;
                }
            }
        }
        System.out.println("排序后：");
        for(int i = 0;i<sort.length;i++){
            System.out.println(sort[i]+" ");
        }
    }
}
