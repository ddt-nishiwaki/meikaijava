package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 配列要素を交換するメソッドを実行するクラス
public class E7_21_aryExchngMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "二つの配列の要素を交換します";
	// 一つ目の配列を作成することを示すメッセージを設定する 
	private static final String MESSAGE_MAKE_FIRST_ARRAY = "一つ目の配列を作成します";
	// 二つ目の配列を作成することを示すメッセージを設定する 
	private static final String MESSAGE_MAKE_SECOND_ARRAY = "二つ目の配列を作成します";
	// 一つ目の配列要素を出力することを示す文字列を設定する
	private static final String MESSAGE_OUTPUT_FIRST_ARRAY = "一つ目の配列要素の値を出力します";
	// 二つ目の配列要素を出力することを示す文字列を設定する
	private static final String MESSAGE_OUTPUT_SECOND_ARRAY = "二つ目の配列要素の値を出力します";
	// 要素交換後の配列を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_EXCHANGED_ARRAY = "要素交換後の配列を出力します";
	/*** スキャナー作成 ******************************/
	// 入力を扱うオブジェクトを作成する
	private static Scanner scannerInput = new Scanner(System.in);

	/*** makeArrayメソッド用定数 ******************************/

	// 配列の長さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH = "配列の長さを設定してください";
	// 各要素の値の入力待ちを示す文字列を設定する
	private static final String FORMAT_REQUEST_ELEMENT = "[%d] の値を入力 : ";

	/*** printArrayElementメソッド用定数 ******************************/
	// 配列要素の出力開始を示す文字列を設定する
	private static final String STRING_START_OUTPUT_ELEMENT = "{ ";
	// 配列要素の出力終了を示す文字列を設定する
	private static final String STRING_END_OUTPUT_ELEMENT = " }";
	// 配列要素を出力する際の区切り文字を設定する
	private static final String ELEMENT_DELIMITER = ", ";
	
	/*** メソッド ******************************/
	// 配列要素を交換するメソッド
	private static void aryExchng (int[] firstArray, int[] secondArray) {
		/*** 変数初期化 ******************************/
		// 一つ目の配列の長さを取得する
		int lengthFirstArray = firstArray.length;
		// 二つ目の配列の長さを取得する
		int lengthSecondArray = secondArray.length;
		// インデックスの要素を一時的に保持する変数を初期化する
		int tempElement = INITIALIZE_ZERO;
		// 走査に使用するために,短い方の配列の長さを設定する(同じ場合は一つ目の配列の長さを設定する)
		int lengthMinimumArray = (lengthFirstArray < lengthSecondArray) ? lengthFirstArray : lengthSecondArray;
		/*** 演算処理 ******************************/
		// 短い方の配列の長さを利用して各インデックスにアクセスする
		for (int indexCount = INITIALIZE_ZERO; indexCount < lengthMinimumArray; indexCount++) {
			// 一つ目の配列の要素を一時的に保持する
			tempElement = firstArray[indexCount];
			// 一つ目の配列要素を二つ目の配列要素で上書きする
			firstArray[indexCount] = secondArray[indexCount];
			// 二つ目の配列要素に一時的に保持した要素を設定する
			secondArray[indexCount] = tempElement;
		}
	}
	
	/*** メソッド ******************************/
	// 配列の全要素を出力するメソッドを設定する
	private static void printArrayElement (int[] targetArray) {
		// 配列の長さを保持する変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		// 配列の長さを取得する
		lengthArray = targetArray.length;
		// 配列要素の出力開始を示す文字列を設定する
		System.out.print(STRING_START_OUTPUT_ELEMENT);
		// 対象の配列の要素にアクセスする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthArray; indexCount++ ) {
			// 初回以外で、区切り文字を出力する
			if ( indexCount != 0 ) {
				// 区切り文字を出力する
				System.out.print(ELEMENT_DELIMITER);
			};
			// 各要素の値を出力する
			System.out.print(targetArray[indexCount]);
		}
		// 配列要素の出力終了を示す文字列を出力する
		System.out.println(STRING_END_OUTPUT_ELEMENT);
	}
	
	/*** メソッド ******************************/
	// 配列を作成するメソッドを設定する
	private static int[] makeArray () {
		// 配列の長さを保持する変数を初期化する
		int lengthMakeArray = INITIALIZE_ZERO;
		// 配列の長さ入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_LENGTH);
		// 入力された長さを保持する
		lengthMakeArray = scannerInput.nextInt();
		// 配列を作成する
		int[] makedArray = new int[lengthMakeArray];
		// 各インデックスにアクセスする
		for (int indexCount = INITIALIZE_ZERO; indexCount < lengthMakeArray; indexCount++ ) {
			// 各インデックスの入力待ちを示す文字列を出力する
			System.out.printf(FORMAT_REQUEST_ELEMENT,indexCount);
			// 各インデックスに値を設定する
			makedArray[indexCount] = scannerInput.nextInt();
		}
		// 作成された配列を返す
		return makedArray;
	}
	
	/*** メインメソッド ******************************/
	// 配列要素を交換するメソッドを実行する
	public static void main (String[] arg) {
		/*** 内容出力処理 ******************************/
		// これから行う処理を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** オブジェクト作成 ******************************/
		// 一つ目の配列を作成することをメッセージで出力する
		System.out.println(MESSAGE_MAKE_FIRST_ARRAY);
		// 一つ目の配列を作成する
		int[] firstArray = makeArray();
		// 二つ目の配列を作成することをメッセージで出力する
		System.out.println(MESSAGE_MAKE_SECOND_ARRAY);
		// 二つ目の配列を作成する
		int[] secondArray = makeArray();

		/*** 配列確認 ******************************/
		// 一つ目の配列を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_FIRST_ARRAY);
		// 一つ目の配列を確認のために出力する
		printArrayElement(firstArray);
		// 二つ目の配列を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_SECOND_ARRAY);
		// 二つ目の配列を確認のために出力する
		printArrayElement(secondArray);

		/*** 演算処理 ******************************/
		// 二つの配列の値を交換する
		aryExchng(firstArray, secondArray);

		/*** 出力処理 ******************************/
		// 要素交換後の配列を表示することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_EXCHANGED_ARRAY);
		// 一つ目の配列を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_FIRST_ARRAY);
		// 一つ目の配列の要素を出力する
		printArrayElement(firstArray);
		// 二つ目の配列を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_SECOND_ARRAY);
		// 二つ目の配列の要素を出力する
		printArrayElement(secondArray);

		/*** 終了処理 ******************************/
		// 入力用ストリームを閉じる
		scannerInput.close();
	}
}
