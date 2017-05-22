package kensyu01;

/*** 機能の読み込み ***********************************/
//入力を扱う機能を読み込む
import java.util.Scanner;


/*** クラス ***********************************/
// 入力された3つの値のうち中央値を出力するメソッドを持つクラス
public class E7_3_medMethod {
	
	/*** 定数設定 ***********************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 入力する値の数を設定する
	private static final int LENGTH_INPUT_ARGUMENTS = 3;
	// 現在のインデックスを次のインデックスにずらす値を設定する
	private static final int VALUE_SHIFT_NEXT = 1;

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
	

	/*** 中央値を出力するメソッド ***********************************/
	// 入力された3つの値のうち中央値を出力するメソッドを設定する
	public static int med ( int firstValue, int secondValue, int thirdValue ) {
		/*** 変数の初期化 ***********************************/
		// 引数を保持する配列を初期化する
		int[] listMedArguments = {
				firstValue,
				secondValue,
				thirdValue
		};
		// 現在の値を保持する変数を初期化する
		int medianValue = INITIALIZE_NUMBER;
		
		/*** 処理 ***********************************/
		// 配列を昇順にソートする
		for ( int indexCount = INITIALIZE_NUMBER; indexCount < LENGTH_INPUT_ARGUMENTS; indexCount++ ) {
			// 現在の値を一時的に変数に保持する
			int temp = listMedArguments[indexCount];
			// 現在の値と他の値を比べる
			for ( int nextIndexCount = indexCount + VALUE_SHIFT_NEXT; nextIndexCount < LENGTH_INPUT_ARGUMENTS; nextIndexCount++ ){	
				// 現在の値が他の値より大きい場合の処理を行う
				if ( listMedArguments[indexCount] > listMedArguments[nextIndexCount] ) {
					// 現在の値を他の値に置き換える
					listMedArguments[indexCount] = listMedArguments[nextIndexCount];
					// 他の値に一時的に保持しておいた現在の値を設定する
					listMedArguments[nextIndexCount] = temp;
				}
			}
		}
		// 配列のインデックスの中央の値を取得する
		medianValue = listMedArguments[LENGTH_INPUT_ARGUMENTS/2];
		
		/*** 終了処理 ***********************************/
		// 中央値を返す
		return medianValue;
	}
	
	
	/*** メインメソッド ***********************************/
	// 入力された3つの値のうち中央値を出力する処理を行う
	public static void main (String[] arg ) {
		// 一つ目の入力を保持する変数を初期化する
		int firstValue = INITIALIZE_NUMBER;
		// 二つ目の入力を保持する変数を初期化する
		int secondValue = INITIALIZE_NUMBER;
		// 三つ目の入力を保持する変数を初期化する
		int thirdValue = INITIALIZE_NUMBER;
		// 中央値を保持する変数を初期化する
		int resultMedValue = INITIALIZE_NUMBER;
		/*** オブジェクトの作成 ***********************************/
		// 引数設定の入力を扱うオブジェクトを作成する
		Scanner scannerArguments = new Scanner(System.in);
		
		/*** 処理 ***********************************/
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
		
		// 入力された値のうちの中央値を求める
		resultMedValue = med(firstValue, secondValue, thirdValue);
		// 求めた中央値を出力する
		System.out.printf(FORMAT_OUTPUT_MIN_NUMBER, resultMedValue);
		
		/*** 終了処理 ***********************/
		// 引数設定用入力ストリームを閉じる
		scannerArguments.close();
	}
}
