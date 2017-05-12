package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;


/**********************************************************/

// ランダムの整数値が設定された配列の最後尾の値を表示するクラス
public class E6_7_GetLastArrayValue {

	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMERIC = 0;
	// 要素数の入力を求めるメッセージを設定する
	private static final String REQUEST_ARRAY_LENGTH = "配列の長さを設定してください";
	// 配列の全要素の値をを出力する旨のメッセージを設定する
	private static final String MESSAGE_OUTPUT_ALL = "配列の全要素の値を出力します";
	// 末尾の値を出力する旨のメッセージのフォーマットを設定する
	private static final String FORMAT_OUTPUT_LAST = "配列の末尾の値は %d です";
	// 各値の区切り文字を設定する
	private static final String VALUE_SEPARATOR = " ";
	// 配列の値を出力する際の括弧開きを設定する
	private static final String FIRST_OUTPUT = "{";
	// 配列の値を出力する際の閉じ括弧を設定する
	private static final String LAST_OUTPUT = "}";
	// 乱数の範囲を設定する
	private static final int RANGE_RANDOM = 10;
	// 配列の末尾のインデックスを取得するための値を設定する
	private static final int SHIFT_LAST_INDEX = -1;
	
	
	/**********************************************************/
	
	// ランダムの整数値が設定された配列の最後尾の値を表示する処理を行う
	public static void main(String[] arg) {
		
		// 要素数の入力を保持する変数を初期化する
		int arrayLength = INITIALIZE_NUMERIC;

		// 要素数の入力を扱うオブジェクトを作成する
		Scanner ScannerArraylength = new Scanner(System.in);
		// 配列に設定する乱数を生成するオブジェクトを作成する
		Random arrayValueGenerator = new Random();
		

		/***************************************************/
		
		// 要素数の入力を求めるメッセージを出力する
		System.out.println(REQUEST_ARRAY_LENGTH);
		// 入力された要素数を保持する
		arrayLength = ScannerArraylength.nextInt();
		// 保持した要素数から配列を作成する
		int[] randomArray = new int[arrayLength];
		// 配列に値を設定していく
		for ( int count = INITIALIZE_NUMERIC; count < arrayLength; count++ ) {
			// 設定した範囲の乱数を設定する
			randomArray[count] = arrayValueGenerator.nextInt(RANGE_RANDOM);
		}
		
		// 出力内容を表示する
		System.out.println(MESSAGE_OUTPUT_ALL);
		
		// 配列の値の出力を囲む括弧を出力する
		System.out.print(FIRST_OUTPUT);
		
		// 配列を走査する
		for ( int count = INITIALIZE_NUMERIC; count < arrayLength; count++ ) {
			// 各値の区切り文字(空白)を出力する
			System.out.print(VALUE_SEPARATOR);
			// 各インデックスの要素を文字列として追記する
			System.out.print(randomArray[count]);
		}
		// 各インデックスの値を示す文字列を括弧で閉じる
		System.out.println(VALUE_SEPARATOR + LAST_OUTPUT);
		
		// 末尾の値を出力する
		System.out.printf(FORMAT_OUTPUT_LAST,randomArray[arrayLength + SHIFT_LAST_INDEX]);


		/***************************************************/

		// 要素数の入力ストリームを閉じる
		ScannerArraylength.close();
	}
}
