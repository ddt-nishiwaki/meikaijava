package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;

// while文の動作を検証する為のクラス
public class E4_4_ValificationWhileStatement {

	// while文が 判定が先, 処理が後 であることを検証する処理を行う
	public static void main(String[] arg){
		
		// 入力を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// カウントする値を保持する為の変数を 0 で初期化する
		int inputCount = 0;
		
		// 整数値の入力を促すメッセージを出力する
		System.out.println("整数値x を入力してください。( 終了するには q を入力 ) : ");
		
		// 整数値が入力されるまで処理を繰り返す
		while ( !standardInput.hasNextInt() ) {
			
		
			// q が入力されている場合の処理を行う
			if ( standardInput.hasNext("q") ) {

				//　プログラムを終了するメッセージを出力する
				System.out.println("プログラムを終了します。");
		
				// 入力ストリームを閉じる
				standardInput.close();
		
				// プログラムを終了する
				return;
				
			}
		
			// 入力が間違えていることをメッセージで出力する
			System.out.println("入力した値が間違えています。");
		
			// 再度入力を促すメッセージを出力する
			System.out.println("整数値x を入力してください。( 終了するには q を入力 ) : ");
		
			// 入力ストリームのトークンを次に移動する
			standardInput.next();
			
		}
		
		// 入力された値を inputCount に保持する
		inputCount = standardInput.nextInt();
		
		// x を1づつ減らしていくことを出力する
		System.out.println("xの値を1づつ減らしていきます。");
		
		// 入力した値から 0 までをカウントし出力する
		while ( inputCount >= 0 ) {
		
			// inputCount を出力する
			System.out.println(inputCount);
			
			// inputCount を デクリメントする
			inputCount--;
			
		}
		
		// while文終了後の inputCount を出力する
		System.out.println("while文終了後の x は " + inputCount + "です。");
		
		//入力ストリームを閉じる
		standardInput.close();

	}
}
