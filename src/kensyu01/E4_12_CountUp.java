package kensyu01;

//入力を扱う機能の読み込み
import java.util.Scanner;

//カウントアップを行うクラス
public class E4_12_CountUp {

	// 入力された値までカウントアップする処理を行う
	public static void main (String[] arg) {
		
		// 入力値を保持する為の変数を宣言する
		int inputValue;
		
		// 出力回数を数える変数を 0 で初期化する
		int outputCount = 0;
		
		// 入力された値を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// カウントアップすることをメッセージで出力する
		System.out.println("カウントアップします。");
		
		// 入力が正しいかどうか判定する処理を行う
		do {
				
			// 前提として inputValueに 0 を代入する
			inputValue = 0;

			
			// 正の整数の入力を促すメッセージを出力する
			System.out.println("1以上の正の整数nを入力してください : ");
			
			// 整数が入力されなかった場合の処理を行う
			if( !standardInput.hasNextInt() ){
				
				// 正しい値の入力を促すメッセージを出力する
				System.out.println("入力が間違えています。");
				
				// 入力ストリームのトークンを次に移動する
				standardInput.next();
				
			// 整数が入力された場合の処理を行う
			} else {
				
				// 入力された値を保持する
				inputValue = standardInput.nextInt();
				
			}
			
			// 入力された値が負の値だった場合の処理を行う
			if ( inputValue < 0 ) {
				
				// 正しい値の入力を促すメッセージを出力する
				System.out.println("負の値が入力されています。");
				
			}
			
		// 入力された値が 0 以下の場合は処理を繰り返す
		} while ( inputValue <= 0 );

		
		// カウントアップの開始をメッセージで出力する
		System.out.println("カウントアップを開始します。");
		
		// 入力された値が 0 になるまで繰り返す
		for ( ; inputValue >= 0; inputValue-- ) {
			
			// 出力回数を出力する
			System.out.println(outputCount);
			
			// 出力回数をカウントする
			outputCount++;
			
		}
		
		// 入力用ストリームを閉じる
		standardInput.close();
		
	}
}
