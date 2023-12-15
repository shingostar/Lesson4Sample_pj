
public class ContinueSample {

    public static void main(String[] args) {
        // 検索対象のデータを準備
        int[] tagetArray = {37,85,64,57,98,100,47,23,71,69};

        // 変数を指定
        int count = 0;

        //配列の全要素を対象に探す
        for (int value :tagetArray) {
            if( value < 60){
            continue;
            }
            //　変数のカウントアップ
            count++;
        }
        //60以上の人数を表示
            System.out.println("60点以上の人は"+count+"人です。");
        }
    }

