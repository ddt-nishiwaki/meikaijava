package kensyu01;

/*** 機能の読み込み ******************************/
// 入力を扱う機能の読み込み
import java.util.Scanner;

/*** クラス ******************************/
// 1 ~ 入力された値 までの 合計を計算するメソッドを持つクラス
public class E7_4_SumMethod {

	/*** 定数設定 ******************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "1 ~ 入力された値 までの 合計を計算する";
	// 値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_SUM_NUMBER = "値を入力してください";
	// 合計値を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_SUM_NUMBER = "1 ~ %d までの合計値は %d です\n";


	/*** メソッド ******************************/
	// 1 ~ 入力された値 までの 合計を計算するメソッド
	public static int sumUp( int sumUpValue ){
		
		/*** 変数初期化 ******************************/
		// 加算する値を保持する変数を初期化する
		int totalSumValue = INITIALIZE_NUMBER;
		
		/*** 処理 ******************************/
		// 入力された値まで順に加算する
		for ( int sumCount = INITIALIZE_NUMBER + 1; sumCount <= sumUpValue; sumCount++ ){
			// カウントを加算する
			totalSumValue += sumCount;
		}

		/*** 終了処理 ******************************/
		// 合計値を返す
		return totalSumValue;
	}
	

	/*** メインメソッド ******************************/
	// 1 ~ 入力された値 までの 合計を計算する処理を行う
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 入力された加算範囲を保持する変数を初期化する
		int valueRangeSum = INITIALIZE_NUMBER;
		// 加算された値を保持する変数を初期化する
		int totalSum = INITIALIZE_NUMBER;
		
		/*** オブジェクト作成 ******************************/
		// 加算範囲の入力を扱うオブジェクトを作成する
		Scanner scannerSumRange = new Scanner(System.in);
		
		/*** 処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 加算の範囲の入力を求める
		System.out.println(MESSAGE_REQUEST_SUM_NUMBER);
		// 入力された値を保持する
		valueRangeSum = scannerSumRange.nextInt();
		
		// 1 ~ 入力された値までの数値を加算する
		for ( int sumCount = INITIALIZE_NUMBER +1; sumCount <= valueRangeSum; sumCount++ ) {
			// 現在の値を合計値に加算していく
			totalSum += sumCount;
		}

		// 合計値を出力する
		System.out.printf(FORMAT_OUTPUT_SUM_NUMBER, valueRangeSum,totalSum);
		
		/*** 終了処理 ******************************/
		// 加算範囲の入力ストリームを閉じる
		scannerSumRange.close();
	}
}
