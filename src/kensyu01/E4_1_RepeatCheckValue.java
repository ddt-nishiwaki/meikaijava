package kensyu01;

// 入力した値を取得する為の機能を読み込む
import java.util.Scanner;

// 入力した値の符号のチェックを 好きなだけ繰り返す為のクラス
public class E4_1_RepeatCheckValue {

	// do while文リピートさせるために使用する値を設定する
	public static final int REPEAT_AGAIN = 1;
	
	// do while文のリピートを終了させるために使用する値を設定する
	public static final int REPEAT_END = 2;

	// 入力した値の符号のチェックを 好きなだけ繰り返す為の処理を行う
	public static void main (String[] arg) {

		// 入力した値を取得する為のクラスを作成する
		Scanner standardInput = new Scanner(System.in);

		// 入力された値で変数を宣言する
		int inputValue;
		// ユーザーの命令を受け取る変数を0で初期化する
		int inputCommand = 0;

		// 入力された値の符号を出力し,もう一度処理を行うかを問う処理を行う
		do {

			// 整数の入力を促す為のメッセージを出力する
			System.out.println("整数値を入力してください。");
			
			// 入力された値が整数でない場合の処理を行う
			if ( !standardInput.hasNextInt() ) {

				// 入力が間違えていることをメッセージで出力する
				System.out.println("入力された値が間違えています。");
				
				// プログラムを終了するメッセージを表示する
				System.out.println("プログラムを終了します。");
				
				// 入力用ストリームを閉じる
				standardInput.close();
				
				// プログラムを終了する
				return;

			// 入力された値が整数値だった場合の処理を行う
			}  else {

				// 入力された値を inputValue に代入する
				inputValue = standardInput.nextInt();

				// 入力された値が0より大きかった場合の処理を行う
				if ( inputValue > 0 ) {

					// 正の整数であることをメッセージで出力する
					System.out.println("入力した値は 正の整数です。");

					// 入力された値が0より大きかった場合の処理を行う
				} else if ( inputValue < 0 ) {

					// 負の整数であることをメッセージで出力する
					System.out.println("入力した値は 負の整数です。");

				// 入力された値が 0 だった場合の処理を行う
				} else {

					// 0であることをメッセージで出力する
					System.out.println("入力された値は 0 です。");

				}

				// もう一度処理を行うかどうかを問うメッセージを出力する
				System.out.println("もう一度？ 1 ... Yes , 2 ,,, No : ");

				// 入力された値が整数でない場合の処理を行う
				if ( !standardInput.hasNextInt() ) {
					
					// 入力が間違えていることをメッセージで出力する
					System.out.println("入力された値が間違えています。");
					
					// プログラムを終了するメッセージを表示する
					System.out.println("プログラムを終了します。");
					
					// 入力用ストリームを閉じる
					standardInput.close();
					
					// プログラムを終了する
					return;
					
				}
				// 入力された値で inputCommand を変更する
				inputCommand = standardInput.nextInt();

				// 想定外の命令が入力された場合の処理を行う
				if ( inputCommand != REPEAT_AGAIN && inputCommand != REPEAT_END ) {
					
					// 入力が間違えていることをメッセージで出力する
					System.out.println("入力された値が間違えています。");
					
					// プログラムを終了するメッセージを表示する
					System.out.println("プログラムを終了します。");
					
					// 入力用ストリームを閉じる
					standardInput.close();
					
					// プログラムを終了する
					return;
					
				// 入力された命令が 2 の場合の処理を行う
				} else if ( inputCommand == REPEAT_END ) {

					// プログラムを終了するメッセージを出力する
					System.out.println("プログラムを終了します。");
					
					// 入力用ストリームを閉じる
					standardInput.close();
					
					// プログラムを終了する
					return;
					
				}

			}

			// 入力された命令が 1 だった場合処理を繰り返す
		} while ( inputCommand == REPEAT_AGAIN );

		// 入力用ストリームを閉じる
		standardInput.close();

	}
}