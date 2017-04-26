package kensyu01;

// 入力を扱う機能の読み込み
import java.util.Scanner;

// カウントダウンを行うクラス
public class E4_11_CountDown {

	// 入力された値までカウントダウンする処理を行う
	public static void main (String[] arg) {
		
		// 入力値を保持する為の変数を 0 で初期化する
		int inputValue = 0;
		
		// ループ処理をカウントする変数を 0 で初期化する
		// いらない？
		
		// 入力された値を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// カウントダウンすることをメッセージで出力する
		System.out.println("カウントダウンします。");
		
		// 入力が正しいかどうか判定する処理を行う
		do {
			
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

		
		// カウントダウンの開始をメッセージで出力する
		System.out.println("カウントダウンを開始します。");
		
		// 入力された値が 0 になるまで繰り返す
		for ( ; inputValue >= 0; inputValue-- ) {
		
			// 入力値を出力する
			System.out.println(inputValue);
			
		}
		
		// 入力用ストリームを閉じる
		standardInput.close();
		
	}
}
