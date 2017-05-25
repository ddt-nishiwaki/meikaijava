package kensyu01;

/*** ライブラリの読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 正の整数を入力した時だけ値を返すメソッドを実行するクラス
public class E7_9_PositiveIntegerPrinter {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "正の整数値を入力すれば、その値を返します";
	// 正の整数値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_POSITIVE_INTEGER = "正の整数値を入力してください : ";
	// 入力が正の整数でないことを示すメッセージを設定する
	private static final String MESSAGE_NOT_POSITIVE_INTEGER = "正の整数値ではありません";
	// 返り値を出力するフォーマットを設定する
	private static final String FORMAT_OUTPUT_RETURN_NUMBER = "返された値は%dです";

	/*** オブジェクト作成 ******************************/
	// 正の整数入力を扱うオブジェクトを作成する
	private static final Scanner scannerPositiveInteger = new Scanner(System.in);
		

	/*** メソッド ******************************/
	// 正の整数を入力した時だけ値を返すメソッドを設定する
	private static int readPlusInt () {

		/*** 変数初期化 ******************************/
		// 入力された正の整数値を保持する変数を初期化する
		int positiveInteger = INITIALIZE_ZERO;
		
		/*** 入力処理 ******************************/
		// 正の整数値が入力されるまで処理を繰り返す
		do {
			// 正の整数値の入力を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_POSITIVE_INTEGER);
			// 入力された値を保持する
			positiveInteger = scannerPositiveInteger.nextInt();
			// 入力された値が正の整数値( 0 以上 )だった場合の処理を行う
			if ( positiveInteger > 0 ) {
				// ループ処理を抜ける
				break;
			};
			// 入力された値が正の整数値でないことを示すメッセージを出力する
			System.out.println(MESSAGE_NOT_POSITIVE_INTEGER);
		// 入力された値が正の整数値でない( 0 以下 )だった場合処理を繰り返す
		} while ( positiveInteger <= 0 );
		
		/*** 終了処理 ******************************/
		// 入力された値を返す
		return positiveInteger;
	}
	

	/*** メインメソッド ******************************/
	// 正の整数を入力した時だけ値を返すメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// メソッドから返された正の整数値を受け取る変数を初期化する
		int receivePositiveInteger = INITIALIZE_ZERO;
		
		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** メソッド実行 ******************************/
		// readPlusIntを実行し、返り値を保持する
		receivePositiveInteger = readPlusInt();

		/*** 出力処理 ******************************/
		// 受け取った返り値を出力する
		System.out.printf(FORMAT_OUTPUT_RETURN_NUMBER,receivePositiveInteger);
		
		/*** 終了処理 ******************************/
		// 正の整数値入力ストリームを閉じる
		scannerPositiveInteger.close();
	}
}
