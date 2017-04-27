package kensyu01;

// 入力を扱う機能の読み込み
import java.util.Scanner;

// 入力した数分アスタリスクを出力するクラス
public class E4_10_PutAsteriskFor {

	// 入力した数分アスタリスクを出力するクラス
	public static void main ( String[] arg ){
		
		// 入力された値を保持する変数を宣言する
		int inputValue = 0;

		// 入力した値を扱う為のオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 出力するさせるアスタリスクの数の入力を促すメッセージを出力する
		System.out.println("何個*を表示しますか？ : ");
		
		// 入力が正しいかどうか判定する処理を行う
		do {
			
			// 正の整数の入力を促すメッセージを出力する
			System.out.println("0以上の正の整数を入力してください : ");
			
			// 整数が入力されなかった場合の処理を行う
			if( !standardInput.hasNextInt() ){
				
				// 正しい値の入力を促すメッセージを出力する
				System.out.println("入力が間違えています。");
				
				// 入力ストリームのトークンを次に移動する
				standardInput.next();
				
				inputValue = -1;
				
			// 入力され値を保持し、負の値だった場合の処理を行う
			} else if ( ( inputValue = standardInput.nextInt() )  < 0 ) {
				
				// 正しい値の入力を促すメッセージを出力する
				System.out.println("負の値が入力されています。");

			}
			
		// 入力された値が 0 以下の場合は処理を繰り返す
		} while ( inputValue < 0 );
		
		
		// 0が入力された場合プログラムを終了させる
		if ( inputValue == 0 ) {

			// 入力ストリームを閉じる
			standardInput.close();
			
			// プログラムを終了させる
			return;
			
		}
		

		// 入力された値の数だけ処理を行う
		for (int loopCounter = 0; inputValue > loopCounter; loopCounter++ ) {
			
			// アスタリスクを出力する
			System.out.print("*");
			
		}
		
		// 改行を出力する
		System.out.println();
		
		
		// 入力用ストリームを閉じる
		standardInput.close();
		
		
	}
}
