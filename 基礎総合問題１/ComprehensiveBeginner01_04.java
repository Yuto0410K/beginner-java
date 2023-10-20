import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        // 人数を入力し、入場料の合計を計算するプログラム
        Scanner sc = new Scanner(System.in);
        System.out.println("入場人数を入力してください");
        int people = sc.nextInt();
        sc.close();
        if (people <= 4) {
            System.out.println("入場料金の合計は" + people * 600 + "円です");
        }
        if (people <= 19 && people >= 5) {
            System.out.println("入場料金合計は" + people * 550 + "円です");
        }
        if (people >= 20) {
            System.out.println("入場料金合計は" + people * 500 + "円です");
        }

    }
}
