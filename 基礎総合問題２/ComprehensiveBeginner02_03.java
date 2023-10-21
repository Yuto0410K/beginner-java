/*以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
 buyDrink() メソッドを持つ、Coffee クラスを使用する
 buyDrink() メソッドを持つ、Juice クラスを使用する
 バヤリース の オレンジ 味です。130 円になります。
 午後の紅茶 の レモンティー 味です。150 円になります。
 ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
 ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。 */
class Coffee {
    void buyDrink(String name) {
        String t = null;// テイスト
        String k = null;// 金額
        if (name == "ボス") {
            t = "控えめミルク無し";
            k = "110";
        } else if (name == "ジョージア") {
            t = "甘めミルク入り";
            k = "120";
        } else {
            System.out.println("該当なし");
        }

        switch (name) {
            case "ボス":
            case "ジョージア":
                System.out.println(name + "の甘さは" + t + "です。 " + k + "円になります。");
                break;
            default:
                System.out.println("該当なし");
                break;
        }
    }
}

class Juice {
    void buyDrink(String name1) {
        String t1 = null;
        String k1 = null;
        if (name1 == "オレンジ") {
            t1 = "バヤリース";
            k1 = "130";
        } else if (name1 == "レモンティー") {
            t1 = "午後の紅茶";
            k1 = "150";
        } else {
            System.out.println("該当なし");
        }

        switch (name1) {
            case "オレンジ":
            case "レモンティー":
                System.out.println(t1 + "の" + name1 + "味です。" + k1 + "円になります。");
                break;
            default:
                System.out.println("該当なし");
                break;
        }
    }
}

public class ComprehensiveBeginner02_03 {
    public static void main(String args[]) {
        Coffee name = new Coffee();
        Juice name1 = new Juice();
        name1.buyDrink("オレンジ");
        name1.buyDrink("レモンティー");
        name.buyDrink("ボス");
        name.buyDrink("ジョージア");
    }
}
