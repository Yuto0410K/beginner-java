/*1から100までの値を繰り返しで表示するが、3の倍数の時はfoo、5の倍数の時はbarと数字の代わりに表示するプログラムを作成してください。
3と5の両方の倍数の時はfoobarと表示されるようにしてください。 */
public class ComprehensiveBeginner01_06 {
    // 1から100までの値を繰り返しで表示するが、3の倍数の時はfoo
    // 5の倍数の時はbarと数字の代わりに表示するプログラム
    // 3と5の両方の倍数の時はfoobar
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("foobar");
            } else if (i % 3 == 0) {
                System.out.println("foo");
            } else if (i % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(i);
            }

        }
    }
}
