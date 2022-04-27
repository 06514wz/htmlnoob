package foure;

public class fifteen {
    public static void main(String[] args) {
        String names[] = {"刘德","张友","邓丽","王志","江珊"};

        int index=-1;
        for(int i=0;i<names.length;i++){
            if(names[i].equals("邓丽")){
                index = i;
                break;
            }
        }
        for(int i = index;i<names.length-1;i++){
            names[i]=names[i+1];
        }
        names[names.length-1]=null;

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
