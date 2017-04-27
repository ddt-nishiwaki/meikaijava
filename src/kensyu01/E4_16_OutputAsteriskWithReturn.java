package kensyu01;

//入力を扱う機能の読み込みを行う
import java.util.Scanner;

//入力した数だけアスタリスクを出力するクラス
public class E4_16_OutputAsteriskWithReturn {
	
	// int型変数を初期化する値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	// 出力回数のカウントの初期値を設定する
	public static final int COUNT_START_VALUE = 1;
	
	// 改行する間隔を設定する
	public static final int RETURN_INTERVAL = 5;
	
	// 入力した数だけアスタリクスを表示する処理を行う
	public static void main (String[] arg) {
		
		// 入力を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 入力した値を保持する変数を 0 で初期化する
		int reqestValue = INITIALIZATION_INTEGER;
		
		// アスタリスクの数を入力させるメッセージを出力
		System.out.println("いくつ*を表示しますか? : ");
		
		// 入力値を保持する
		reqestValue = standardInput.nextInt();
		
		// 入力値分処理を繰り返す
		for ( int count = COUNT_START_VALUE; reqestValue >= count; ++count) {
		
			// アスタリスクを表示する
			System.out.print("*");
			
			// 改行間隔のタイミングで処理する
			if ( count % RETURN_INTERVAL == 0 ) {
				
				// 改行を出力する
				System.out.println();
				
			}
		}
		
		// 入力ストリームを閉じる
		standardInput.close();
		
	}

}
