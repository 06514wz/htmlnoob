package foure;

/*复制数组{1，2，3，4，5}中从小标0开始的5个元素到目标数组
{6，7，8，，9，10，11，12，13，14，15}，且从目标数组的下标为0的位置开始储存*/
public class ten {
    public static void main(String[] args) {
        int aa[] = {1,2,3,4,5};
        int bb[] = {6,7,8,9,10,11,12,13,14,15};

        System.arraycopy(aa,0,bb,0,5);

        for(int i=0;i<aa.length;i++){
            System.out.println(aa[i] + "");
        }
        System.out.println();

        for(int j=0;j<bb.length;j++){
            System.out.println(bb[j]+"");
        }
        System.out.println();

    }
}
