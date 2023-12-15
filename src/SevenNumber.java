
public class SevenNumber {

    public static void main(String[] args) {
            // iの値が0から100より小さい間、処理を繰り返す
            for (int i = 0; i < 100; i++) {// 初期値の設定
                //7の倍数を計算
                if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                // iの値を表示
         System.out.println("clap!");
            } else {
         System.out.println(i);
        }
      }
    }
}
