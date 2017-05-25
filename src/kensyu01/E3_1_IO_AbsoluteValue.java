package kensyu01;

//入力した値を読み込む為の機能の読み込みを行う
import java.util.Scanner;

// 入力した値の絶対値を出力するクラス
public class E3_1_IO_AbsoluteValue {

	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "入力された値の絶対値を調べます";
	// 整数値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_INPUT_INTEGER = "整数値を入力 : ";
	// 入力された値の絶対値を示すメッセージのフォーマットを設定する
	private static final String FORMAT_OUTPUT_ABSOLUTE_NUMBER = "その絶対値は%dです\n";
	// 入力が不正な場合のメッセージを設定する
	private static final String MESSAGE_CAUTION_INPUT_INVAILD = "入力が不正です";
	

	// 整数値の入力を確実に行うメソッド
	private static int scanInteger () {

		/*** オブジェクトの作成 ******************************/
		// 整数値入力を扱うオブジェクトを作成する
		Scanner scannerInteger = new Scanner(System.in);

		/*** 変数の初期化 ******************************/
		// 入力を保持する変数を初期化する
		int inputValue = INITIALIZE_ZERO;

		/*** 入力処理 ******************************/
		// 整数値が入力されるまで繰り返す
		do {
			// 入力された値が整数値だった場合の処理を行う
			if ( scannerInteger.hasNextInt() ) {
				// 入力された値を保持する
				inputValue = scannerInteger.nextInt();
				// ループ処理を終了する
				break;
			// 入力された値が整数値じゃ勝った場合の処理を行う
			} else {
				// 入力が間違えていることを出力する
				System.out.println(MESSAGE_CAUTION_INPUT_INVAILD);
				// 整数値の入力を求めるメッセージを出力する
				System.out.println(MESSAGE_REQUEST_INPUT_INTEGER);
				// 入力ストリームのトークンを次に移動する
				scannerInteger.next();
			}
		// 整数値が設定されるまで繰り返す
		} while ( inputValue == INITIALIZE_ZERO);
		
		/*** 終了処理 ******************************/
		// 整数値入力用ストリームを閉じる
		scannerInteger.close();
		// 設定された整数値を返す
		return inputValue;
	}
	
	
	// 入力した値を絶対値で出力する為の処理を行う
	public static void main (String[] arg){
		// 読み込んだ整数値を保持する変数を初期化する
		int inputValue = INITIALIZE_ZERO;
		// 入力した値を読み込む為のオブジェクトを作成する
		Scanner scannerInteger = new Scanner(System.in);
		
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 整数値の入力を促すメッセージを出力する為の処理する
		System.out.println(MESSAGE_REQUEST_INPUT_INTEGER);
		
		// 整数値を確実に読み込む
		inputValue = scanInteger();
		
		
		// 入力された値が0未満の場合 -1 を乗算して絶対値に変換する為の処理を行う
		if( inputValue < 0 ) {
			
			// 正の整数に変換する
			inputValue *= -1;
		}
		
		// 変数inputValueを出力する為の処理を行う
		System.out.printf(FORMAT_OUTPUT_ABSOLUTE_NUMBER, inputValue);
		
		// 入力用ストリームを閉じる
		scannerInteger.close();
	}
		
}
