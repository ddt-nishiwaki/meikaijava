package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;

// 読み込んだ負以外の整数の合計と平均を表示するクラス
public class E4_26_SumContinue {
	
	// int型整数を初期化する値を設定する
	private static final int INITIALIZE_INTEGER = 0;
	// 処理内容を説明するメッセージを設定する
	private static final String MESSAGE_PROCESSING = "整数を加算します。";
	// 入力回数の設定を求めるメッセージを設定する
	private static final String MESSAGE_REQEST_TIMES = "何回入力しますか？";
	// 加算する値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INTEGER = "整数値を入力してください。";
	// 負の値は加算しないことを説明するメッセージ定する
	private static final String MESSAGE_INVAILD_VALUE = "負の値は加算しません。";
	// テキスト「合計」を設定する
	private static final String TEXT_TOTAL = "合計";
	// テキスト「平均」を設定する
	private static final String TEXT_AVARAGE = "平均";
	
	/*************************************************************/
	
	// 読み込んだ負以外の整数の合計と平均を表示する処理を行う
	public static void main (String[] arg) {
		
		// 整数値の入力を扱うオブジェクトを作成する
		Scanner scannerSumAverageOperand = new Scanner(System.in);
		// 加算結果を保持する変数を初期化する
		int sumValue = INITIALIZE_INTEGER;
		// 処理回数をカウントする変数を初期化する
		int sumCount = INITIALIZE_INTEGER;
		
		/*********************************************************/

		// これから行う処理をメッセージで出力する
		System.out.println(MESSAGE_PROCESSING);
		// 入力回数の設定を求めるメッセージを出力する
		System.out.println(MESSAGE_REQEST_TIMES);
		// 入力された値を保持する
		int operateTimes = scannerSumAverageOperand.nextInt();
		
		// 設定された入力回数分処理を行う
		for ( int count = INITIALIZE_INTEGER; count < operateTimes; count++ ) {
			// 加算する値の入力を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_INTEGER);
			// 入力された値を一時的に保持する
			int temp = scannerSumAverageOperand.nextInt();
			// 入力された値が負の値だった場合の処理
			if ( temp < 0 ) {
				// 負の値は加算しないことをメッセージで出力する
				System.out.println(MESSAGE_INVAILD_VALUE);
				// 処理をスキップする
				continue;
			}
			// 入力された値を加算する
			sumValue += temp;
			// 処理回数をカウントする
			sumCount++;
		}
		
		/*********************************************************/

		// 入力された値の合計を出力する
		System.out.println(TEXT_TOTAL + "は" + sumValue + "です。");
		// 入力された値の平均を出力する
		System.out.println(TEXT_AVARAGE + "は" + sumValue/sumCount + "です。");
		
		/*********************************************************/

		// 整数値の入力ストリームを閉じる
		scannerSumAverageOperand.close();
	}
}
