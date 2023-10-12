public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        // 九九の表を、2重の繰り返し(2重for文)を使って表示するプログラム
        System.out.println("九九の表↓");
        for (int i = 1; i <= 9; i++) {
            System.out.println("");
            for (int j = 1; j <= 9; j++) {
                System.out.print(","+i * j);
                
            }
        }
    }
}
