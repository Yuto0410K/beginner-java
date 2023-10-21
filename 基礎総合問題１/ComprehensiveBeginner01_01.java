/*整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。*/
import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        System.out.println("整数値を入力してください");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if (number % 2 == 0) {
            System.out.println("even");// 偶数
        } else {
            System.out.println("add");// 奇数
        }
    }
}
