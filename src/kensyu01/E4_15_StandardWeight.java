package kensyu01;

//入力を扱う機能を読み込む
import java.util.Scanner;

//カウントアップを行い、その数の全ての和を示す式を表示するクラス

public class E4_15_StandardWeight {

	// 入力された値までカウントアップし、その数の全ての和を示す式を表示する処理
	public static void main (String[] arg) {
		
		// 入力された開始値を保持する変数 0 で初期化するする
		int heightValue = 0;
		
		// 入力された終了値を保持する変数 0 で初期化するする
		int endValue = 0;
		
		// 入力された増分を保持する変数 0 で初期化するする
		int outputInterval = 0;
		
		// 入力された値を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 開始値の入力を促すメッセージを出力する
		System.out.print("何cmから : ");
		
		// 入力された値を変数に保持する
		heightValue = standardInput.nextInt();
		
		// 終了値の入力を促すメッセージを出力する
		System.out.print("何cmまで : ");
		
		// 入力された値を変数に保持する
		endValue = standardInput.nextInt();
		
		// 終了値の入力を促すメッセージを出力する
		System.out.print("何cmごと : ");
		
		// 入力された値を変数に保持する
		outputInterval = standardInput.nextInt();
		

			
		// 出力項目をメッセージで出力する
		System.out.println("身長　標準体重");
		
		// 身長 + 増分 が 終了値より小さい場合、処理を繰り返す
		while ( heightValue <= endValue ) {
			
			// 現在の身長を出力する
			System.out.print(heightValue + "　");
			
			// 標準体重を表示する( 身長 - 100 ) * 0.9
			System.out.println( ( heightValue - 100 ) * 0.9 );
			
			// 次に表示する体重を設定する
			heightValue += outputInterval;
			
		}
		
		// 入力用ストリームを閉じる
		standardInput.close();
	}
}
