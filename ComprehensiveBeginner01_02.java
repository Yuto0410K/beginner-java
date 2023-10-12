import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("整数値を3つ入力してください");
        int k = sc.nextInt();
        int j = sc.nextInt();
        int u = sc.nextInt();
        sc.close();
        if (k <= j && j <= u) {

            System.out.println("OK");//小さい順なら
        } else {
            System.out.println("NG");//それ以外
        }
    }
}
