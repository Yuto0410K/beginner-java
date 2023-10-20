import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_01 {
    public static void main(String args[]) {
        System.out.println("ゾロ目で大当たり!チャンスは30回");
        boolean bool = true;
        Scanner sc = null;
        // ブレークポイント ●そのポイントまでDebugできる
        // F10で一行ずつ確認できる
        // -encoding UTF-8 ○○.java
        while (bool) {
            sc = new Scanner(System.in);
            System.out.println("beginと入力してください");
            String beg = sc.nextLine();

            if (beg.equals("begin")) {
                for (int i = 1; i <= 30; i++) {
                    int num1 = new Random().nextInt(9) + 1;
                    int num2 = new Random().nextInt(9) + 1;
                    int num3 = new Random().nextInt(9) + 1;
                    System.out.println(+i + "回目:" + num1 + num2 + num3);
                    if (num1 == num2 && num2 == num3) {
                        System.out.println(i + "回目で大当たりです。おめでとうございます！");
                        break;
                    } else if (i == 30) {
                        System.out.println("残念でした。終わります");
                    } else {
                        System.out.println("該当なし");
                    }
                }bool = false;

            } else {
                continue;// begin以外の入力の場合、whileに戻る
            }
            // bool = false; // whileの条件のboolをfalseに変更して条件から向け出す
        } sc.close();
    }
}
