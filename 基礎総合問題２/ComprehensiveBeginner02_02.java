import java.util.Scanner;
import java.util.Random;

public class ComprehensiveBeginner02_02 {
    public static void main(String args[]) {
        //javac -encoding UTF-8 ComprehensiveBeginner02_02.java
        //java ComprehensiveBeginner02_02
        boolean b = true;
        Scanner sc = null;
        while (b) {
            System.out.println("ジャンケン");
            sc = new Scanner(System.in);
            System.out.println("0:グー 1:チョキ 2:パー >数字を入力してください");
            int num = sc.nextInt();
            int j = new Random().nextInt(2);
            if (num == 0 || num == 1 || num == 2) {
                if (num == j) {
                    System.out.println("あいこです");
                } else if (j == 1 && num == 0 || j == 2 && num == 1 || j == 0 && num == 2) {
                    System.out.println("あなたの勝ちです");
                } else {
                    System.out.println("あなたの負けです");
                }
                b = false;
            } else {  
                 System.out.println("エラーです");
                continue;
            }sc.close();
        }
    }
}
