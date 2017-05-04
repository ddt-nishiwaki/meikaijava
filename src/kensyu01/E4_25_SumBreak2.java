package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;

// 読み込んだ整数を合計が1000を超えないように加算し合計と、入力の平均値を出力するクラス
public class E4_25_SumBreak2 {

	//// 定数の設定 ///////////////////////////////
	
	// int型変数を初期化する値を設定する
	public static final int INITIALIZE_INTEGER = 0;
	// String型変数を初期化する値を設定する
	public static final String INITIALIZE_STRING = "";
	// テキスト「加算結果」を設定する
	public static final String MESSAGE_RESULT_SUM = "加算結果";
	// テキスト「平均値」を設定する
	public static final String MESSAGE_VALUE_AVERAGE = "平均値";
	// 処理内容を文字列で設定する
	public static final String MESSAGE_OF_PROCESSING = "整数を加算して、合計値と平均値を出力します";
	// 演算する回数の入力を求めるメッセージを設定する
	public static final String MESSAGE_OF_OPERATION_TIMES = "何回入力しますか？";
	// 整数値の入力を求めるメッセージを設定する
	public static final String MESSAGE_OF_INPUT_INTEGER = "整数値を入力してください";
	// 加算合計の上限を設定する
	public static final int LIMIT_VALUE = 1000;
	// 上限を超えた時のメッセージを設定する
	public static final String MESSAGE_OVER_LIMIT = "合計が1000を超えています。\n最後の数値は無視します。";
	

	//// メソッド ///////////////////////////////

	// 読み込んだ整数を合計が1000を超えないように加算し合計と、入力の平均値を出力する
	public static void main(String[] arg) {
		
	//// 編集の初期化 //////////////////////////////////////////////////////////////
		
		// 入力された整数値を扱うオブジェクトを作成する
		Scanner integerValueInput = new Scanner(System.in);
		// 入力された演算回数を保持する変数を初期化する
		int operateTimes = INITIALIZE_INTEGER;
		// 入力された整数値を保持するための変数を初期化する
		int integerValue = INITIALIZE_INTEGER;
		// 入力された整数値を加算するための変数を初期化する
		int sumValue = INITIALIZE_INTEGER;
		// 演算回数をカウントする変数を初期化する
		int operateCount = INITIALIZE_INTEGER;
		

	//// 処理 ///////////////////////////////////////////////////////////////

		// これから行う処理内容を出力する
		System.out.println(MESSAGE_OF_PROCESSING);
		// 演算する回数の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_OF_OPERATION_TIMES);
		// 入力された回数を変数に保持する
		operateTimes = integerValueInput.nextInt();
		
		// 入力された回数分処理を行う
		for ( int count = INITIALIZE_INTEGER; count < operateTimes; count++) {
		
			// 整数値の入力を求めるメッセージを出力する
			System.out.println(MESSAGE_OF_INPUT_INTEGER);
		
			// 入力された値を保持する
			integerValue = integerValueInput.nextInt();
			
			// 次の加算の結果が1000以下の場合の処理を行う
			if ( sumValue + integerValue <= LIMIT_VALUE ) {
				// 演算回数をカウントする
				operateCount++;
				// 入力された値を変数に加算していく
				sumValue += integerValue;
			// それ以外の場合の処理を行う
			} else {
				// 加算の上限を超える場合のメッセージを出力する
				System.out.println(MESSAGE_OVER_LIMIT);
				// ループ処理を終了する
				break;
			}
		
		}
		
	///////////////////////////////////////////////////////////////////

		// 加算結果を出力する
		System.out.println( MESSAGE_RESULT_SUM + "は" + sumValue +"です");
		
		// 入力された値の平均値を出力する
		System.out.println( MESSAGE_VALUE_AVERAGE +"は"+ sumValue/operateCount +"です");
		
		// 整数値を扱う入力ストリームを閉じる
		integerValueInput.close();
	
	}
}
