package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 配列の複製を作成するメソッドを実行するクラス
public class E7_22_ArrayCloneMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "配列の複製を作成するメソッドを実行します";
	private static final String MESSAGE_OUTPUT_TARGET_ARRAY = "対象の配列要素を出力します";
	private static final String MESSAGE_OUTPUT_CLONE_ARRAY = "複製した配列要素を出力します";
	/*** オブジェクト作成 ******************************/
	private static Scanner scannerInput = new Scanner(System.in);

	/*** makeArrayメソッド用定数 ******************************/
	// 配列の長さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH = "配列の長さを 1 以上の整数値で設定してください";
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
	// 配列の複製を作成するメソッドを設定する
	private static int[] arrayClone (int[] targetArray) {
		/*** 変数初期化 ******************************/
		// 配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		/*** オブジェクト作成 ******************************/
		// 複製用の配列を作成する
		int[] cloneArray = new int[lengthTargetArray];
		/*** 要素のコピー ******************************/
		// 複製用の配列に要素をコピーする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ) {
			// 各インデックスの値をコピーする
			cloneArray[indexCount] = targetArray[indexCount];
		}
		/*** 終了処理 ******************************/
		// 複製された配列を返す
		return cloneArray;
	}
	
	/*** メソッド ******************************/
	// 配列を作成するメソッドを設定する
	private static int[] makeArray () {
		// 配列の長さを保持する変数を初期化する
		int lengthMakeArray = INITIALIZE_ZERO;
		// 配列が作成できる長さを入力するまで繰り返す
		do {
			// 配列の長さ入力を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_LENGTH);
			// 入力された長さを保持する
			lengthMakeArray = scannerInput.nextInt();
		// 長さが 0 以下の時は再入力を求める
		} while (lengthMakeArray <= 0);
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
	
	/*** メインメソッド ******************************/
	// 配列の複製を作成するメソッドを実行するメソッドを実行する
	public static void main (String[] arg) {
		/*** 内容出力処理 ******************************/
		// 処理の内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** オブジェクト作成 ******************************/
		// 対象の配列を作成する
		int[] targetArray = makeArray();
		// 対象の配列を複製する
		int[] cloneArray = arrayClone(targetArray);

		/*** 終了処理 ******************************/
		// 対象の配列を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_TARGET_ARRAY);
		// 対象の配列を出力する
		printArrayElement(targetArray);
		// 複製した配列を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_CLONE_ARRAY);
		// 複製した配列を出力する
		printArrayElement(cloneArray);
	}
}
