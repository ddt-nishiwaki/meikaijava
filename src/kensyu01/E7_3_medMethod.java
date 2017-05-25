package kensyu01;

/*** 機能の読み込み ***********************************/
//入力を扱う機能を読み込む
import java.util.Scanner;


/*** クラス ***********************************/
// 入力された3つの値のうち中央値を出力するメソッドを持つクラス
public class E7_3_medMethod {

	/*** 数値型定数設定 ***********************************/
	// 数値型変数を初期化する値を設定する

	private static final int INITIALIZE_ZERO = 0;
	/*** 文字列型定数設定 ***********************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "入力した数値のうち、中央値を判定します";
	// 値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_THREE_NUMBERS = "3つの整数値を入力してください";
	// 一つ目の値入力を求めるメッセージのメッセージを設定する
	private static final String MESSAGE_REQUEST_FIRST_INPUT = "1つめの整数値を入力 : ";
	// 二つ目の値入力を求めるメッセージのメッセージを設定する
	private static final String MESSAGE_REQUEST_SECOND_INPUT = "2つめの整数値を入力 : ";
	// 三つ目の値入力を求めるメッセージのメッセージを設定する
	private static final String MESSAGE_REQUEST_THIRD_INPUT = "3つめの整数値を入力 : ";
	// 中央の値を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_MIN_NUMBER = "中央の値は%dです\n";
	

	/*** メソッド ***********************************/
	// 入力された3つの値のうち中央値を出力するメソッドを設定する
	private static int med ( int firstValue, int secondValue, int thirdValue ) {

		/*** 変数の初期化 ***********************************/
		// 現在の値を保持する変数を初期化する
		int medianValue = INITIALIZE_ZERO;
		
		/*** 演算処理 ***********************************/
		// 一つ目の値と二つ目の値のうち、小さくない方の値を保持する
		medianValue = ( firstValue >= secondValue ) ? firstValue : secondValue;
		// 中央値となる値を変数に保持する
		medianValue = ( firstValue != secondValue && medianValue >= thirdValue ) ? thirdValue : medianValue;
		
		/*** 終了処理 ***********************************/
		// 中央値を返す
		return medianValue;
	}
	
	
	/*** メインメソッド ***********************************/
	// 入力された3つの値のうち中央値を出力する処理を行う
	public static void main (String[] arg ) {

		/*** 変数初期化 ***********************************/
		// 一つ目の入力を保持する変数を 0　で初期化する
		int firstValue = INITIALIZE_ZERO;
		// 二つ目の入力を保持する変数を 0　で初期化する
		int secondValue = INITIALIZE_ZERO;
		// 三つ目の入力を保持する変数を 0　で初期化する
		int thirdValue = INITIALIZE_ZERO;
		// 中央値を保持する変数を 0　で初期化する
		int resultMedValue = INITIALIZE_ZERO;

		/*** オブジェクトの作成 ***********************************/
		// 引数設定の入力を扱うオブジェクトを作成する
		Scanner scannerArguments = new Scanner(System.in);
		
		/*** 入力処理 ***********************************/
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
		
		/*** 出力処理 ***********************************/
		// 入力された値のうちの中央値を求める
		resultMedValue = med(firstValue, secondValue, thirdValue);
		// 求めた中央値を出力する
		System.out.printf(FORMAT_OUTPUT_MIN_NUMBER, resultMedValue);
		
		/*** 終了処理 ***********************/
		// 引数設定用入力ストリームを閉じる
		scannerArguments.close();
	}
}
