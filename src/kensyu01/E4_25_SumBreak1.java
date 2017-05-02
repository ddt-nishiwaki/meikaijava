package kensyu01;

// 入力した値を扱う機能を読み込む
import java.util.Scanner;

// 読み込んだ整数の合計と平均を表示するクラス
public class E4_25_SumBreak1 {
	
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
	
	// 終了させる値を示すメッセージを設定する
	public static final String MESSAGE_OF_END_CONDITION = "(0で終了します)";

	// 演算を途中で終了させる値を設定する
	public static final int END_VALUE = 0;

	///////////////////////////////////////////////////////////////////
	
	// 読み込んだ整数の合計と平均を表示する処理を行う
	public static void main (String[] arg) {
		
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
		
	///////////////////////////////////////////////////////////////////

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
			
			// 終了させる値 が入力された場合の処理を行う  
			if ( integerValue == END_VALUE ) {
				
				// 処理を終了する
				break;

			}
			
			// 演算回数をカウントする
			operateCount++;
			
			// 入力された値を変数に加算していく
			sumValue += integerValue;
		
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
