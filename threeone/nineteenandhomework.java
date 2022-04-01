package threeone;

public class nineteenandhomework {
    public static void main(String[] args) {
        int number = 0;
            num/*标签*/:for (int i = 1; i <= 8; i++) {
                for (int x = 1; x <= 8; x++) {
                    if (i == 2 && x == 5) {
                        break num;
                    }
                   number=++number;
                    System.out.println("第" + i + "排" + "第" + x + "列" + ":" + number);/*"+"表示连接符*/
                }
            }
        }
    }
