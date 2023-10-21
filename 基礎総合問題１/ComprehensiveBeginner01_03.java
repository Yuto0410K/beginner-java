/*2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。*/
import java.util.Scanner;

public class ComprehensiveBeginner01_03 {
    // 実数解 ⇒ 二次方程式の解が実数で異なる２つの値
    // 重解 ⇒ 二次方程式の解が実数で、ただ１つの値
    // 虚数解 ⇒ 解が異なる２つの虚数
    // 2次方程式ax2+bx+c=0の判別式を下記に示します。D＝b2(b*b)－4ac
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("二次方程式 ax^2 + bx + c = 0 を使って求めます");
        System.out.println("整数値を3つ入力してください");
        System.out.println("一つ目 a");
        int a = sc.nextInt();
        System.out.println("二つ目 b");
        int b = sc.nextInt();
        System.out.println("三つ目 c");
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        sc.close();
        if (d > 0) {
            System.out.println("実数解");
        } else if (d == 0) {
            System.out.println("重解");
        } else {
            System.out.println("虚数解");
        }

    }

}
