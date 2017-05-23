package kensyu01;

/*** 機能の読み込み ************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ************************/
// 3つの値のうちの最小値を求めるメソッドを持つクラス
public class E7_2_minMethod {
	
	/*** 数値型定数設定 ************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "入力した数値のうち、最小値を判定します";
	// 値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_THREE_NUMBERS = "3つの整数値を入力してください";
	// 一つ目の値入力を求めるメッセージのメッセージを設定する
	private static final String MESSAGE_REQUEST_FIRST_INPUT = "1つめの整数値を入力 : ";
	// 二つ目の値入力を求めるメッセージのメッセージを設定する
	private static final String MESSAGE_REQUEST_SECOND_INPUT = "2つめの整数値を入力 : ";
	// 三つ目の値入力を求めるメッセージのメッセージを設定する
	private static final String MESSAGE_REQUEST_THIRD_INPUT = "3つめの整数値を入力 : ";
	// 最小の値を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_MIN_NUMBER = "最小の値は%dです\n";
	

	/*** 最小値を求めるメソッド ************************/
	// 3つの値のうちの最小値を求めるメソッド
	private static int min( int firstValue, int secondValue, int thirdValue ) {

		/*** 変数の初期化 ************************/
		// 最小値を第一引数で初期化する
		int minimumValue = firstValue;

		/*** 演算処理 ************************/
		// 第二引数が現在の最小値より小さい場合は値を上書きする
		minimumValue = ( secondValue < minimumValue ) ? secondValue : minimumValue;
		// 第三引数が現在の最小値より小さい場合は値を上書きする
		minimumValue = ( thirdValue < minimumValue ) ? thirdValue : minimumValue;
			
		/*** 終了処理 ************************/
		return minimumValue;
	}


	/*** メインメソッド ************************/
	// 3つの値のうちの最小値を求める処理を行う
	public static void main (String[] arg ) {

		/*** 変数の初期化 ************************/
		// 一つ目の入力を保持する変数を初期化する
		int firstValue = INITIALIZE_ZERO;
		// 二つ目の入力を保持する変数を初期化する
		int secondValue = INITIALIZE_ZERO;
		// 三つ目の入力を保持する変数を初期化する
		int thirdValue = INITIALIZE_ZERO;
		// 最小の値を保持する変数を初期化する
		int resultMinValue = INITIALIZE_ZERO;

		/*** オブジェクトの作成 ************************/
		// 引数設定の入力を扱うオブジェクトを作成する
		Scanner scannerArguments = new Scanner(System.in);

		/*** 入力処理 ************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 3つの値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_THREE_NUMBERS);
		// 一つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_FIRST_INPUT);
		// 一つ目の入力を保持する
		firstValue = scannerArguments.nextInt();
		// 二つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_SECOND_INPUT);
		// 二つ目の入力を保持する
		secondValue = scannerArguments.nextInt();
		// 三つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_THIRD_INPUT);
		// 三つ目の入力を保持する
		thirdValue = scannerArguments.nextInt();
		
		/*** 演算処理 ************************/
		// 入力された値のうちの最小値を求める
		resultMinValue = min(firstValue, secondValue, thirdValue);

		/*** 出力処理 ************************/
		// 求めた最小値を出力する
		System.out.printf(FORMAT_OUTPUT_MIN_NUMBER, resultMinValue);
		
		/*** 終了処理 ***********************/
		// 引数設定用入力ストリームを閉じる
		scannerArguments.close();
	}
}
