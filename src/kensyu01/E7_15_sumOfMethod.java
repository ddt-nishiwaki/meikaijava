package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 受け取った配列の値の合計値を求めるメソッドを実行するクラス
public class E7_15_sumOfMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "配列を作成し、その配列の各インデックスの合計を求めるメソッドを実行する";
	// 整数値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_ARRAY_LENGTH = "配列の長さを入力してください";
	// 各インデックスの値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_ARRAY_VALUE = "各インデックスの値を入力してください";
	// 各インデックスの値の入力まち状態のテキストフォーマットを設定する
	private static final String FORMAT_REQUEST_INDEX_VALUE = "[%d] の値を入力 : ";
	// 各インデックスの合計値を出力することを示すメッセージを出力する
	private static final String FORMAT_RESULT_SUM_VALUE = "各インデックスの値の合計は %d です"; 


	/*** メソッド ******************************/
	// 受け取った配列の値の合計値を求めるメソッドを設定する
	private static int sumOf (int[] targetArray) {
		/*** 変数初期化 ******************************/
		// 合計値を保持する変数を初期化する
		int valueSumArray = INITIALIZE_ZERO;
		// 受け取った配列の長さを保持する変数を初期化する
		int lengthTargetArray = INITIALIZE_ZERO;
		/*** 演算処理 ******************************/
		// 受け取った配列の長さを取得する
		lengthTargetArray = targetArray.length;
		// 配列の各インデックスの値を調べる
		for (int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ) {
			// 各インデックスの値を加算する
			valueSumArray += targetArray[indexCount];
		}
		/*** 終了処理 ******************************/
		return valueSumArray;
	}
	

	/*** メインメソッド ******************************/
	// 受け取った配列の値の合計値を求めるメソッドを実行する
	public static void main (String[] arg) {
		
		/*** 変数初期化 ******************************/
		// 配列の長さを設定する変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		 
		/*** オブジェクト作成 ******************************/
		// 配列設定用の入力を扱うオブジェクトを作成する
		Scanner scannerSettingArray = new Scanner(System.in);
		
		/*** 内容出力処理 ******************************/
		// 処理内容を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** 配列の作成処理 ******************************/
		// 配列の長さの設定を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_ARRAY_LENGTH);
		// 入力された配列の長さを保持する
		lengthArray = scannerSettingArray.nextInt();
		// 配列を作成する
		int[] targetArray = new int[lengthArray];

		/*** 入力処理 ******************************/
		// 各インデックスの入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_ARRAY_VALUE);
		// 配列の各インデックスを設定する
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthArray; indexCount++){
			// 各インデックスの入力待ちを示すテキストを表示する
			System.out.printf(FORMAT_REQUEST_INDEX_VALUE,indexCount);
			// 入力された値を設定する
			targetArray[indexCount] = scannerSettingArray.nextInt();
		}

		/*** 演算、出力処理 ******************************/
		// 各値の合計結果を出力することをメッセージで出力する
		System.out.printf(FORMAT_RESULT_SUM_VALUE,sumOf(targetArray));

		/*** 終了処理 ******************************/
		// 配列設定用の入力ストリームを閉じる
		scannerSettingArray.close();
	}
}
