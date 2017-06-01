package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 配列に要素を挿入するメソッドを実行するクラス
public class E7_20_aryInsMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の長さを最後のインデックスに変換する値を設定する
	private static final int NUMBER_FORMATING_LAST_INDEX = -1;
	// 前のインデックスに変換するための値を設定する
	private static final int NUMBER_SHIFT_PREV_INDEX = -1;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "配列の任意のインデックスに要素を挿入します";

	/*** スキャナー作成 ******************************/
	// 入力を扱うオブジェクトを作成する
	private static Scanner scannerInput = new Scanner(System.in);

	/*** makeArrayメソッド用定数 ******************************/
	// 配列を作成することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_ARRAY = "配列を作成します";
	// 配列の長さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH = "配列の長さを設定してください";
	// 各要素の値の入力待ちを示す文字列を設定する
	private static final String FORMAT_REQUEST_ELEMENT = "[%d] の値を入力 : ";

	/*** printArrayElementメソッド用定数 ******************************/
	// 配列要素を出力することを示す文字列を設定する
	private static final String MESSAGE_OUTPUT_ELEMENT = "配列の値を出力します";
	// 配列要素の出力開始を示す文字列を設定する
	private static final String STRING_START_OUTPUT_ELEMENT = "{ ";
	// 配列要素の出力終了を示す文字列を設定する
	private static final String STRING_END_OUTPUT_ELEMENT = " }";
	// 配列要素を出力する際の区切り文字を設定する
	private static final String ELEMENT_DELIMITER = ", ";
	// 値を挿入するインデックスの入力を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_INSERT_INDEX = "値を挿入する箇所を 0 ~ %d で入力してください";
	// 配列に挿入する値の入力を求めるメッセージを出力する
	private static final String MESSAGE_REQUEST_INSERT_VALUE = "配列に挿入する要素の値を入力してください";

	/*** メソッド ******************************/
	// 配列に要素を挿入するメソッド
	private static void aryIns (int[] targetArray, int targetIndex, int addElement) {
		/*** 変数初期化 ******************************/
		// 配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		// 配列の最後のインデックスを設定する
		int lastIndex = lengthTargetArray + NUMBER_FORMATING_LAST_INDEX;
		/*** 処理 ******************************/
		// 配列の対象のインデックスまで後方のインデックスからアクセスする
		for ( int indexCount = lastIndex; indexCount >= targetIndex; indexCount-- ) {
			// 前方のインデックスにアクセスする値を設定する
			int prevIndex = indexCount + NUMBER_SHIFT_PREV_INDEX;
			// 対象のインデックスの場合は追加する値を設定する
			if (indexCount == targetIndex){
				// 要素を挿入する
				targetArray[indexCount] = addElement;
				// 繰り返し処理を抜ける
				break;
			}
			// 現在のインデックスを前方のインデックスで上書きする
			targetArray[indexCount] = targetArray[prevIndex];
		};
	}

	/*** メソッド ******************************/
	// 配列を作成するメソッドを設定する
	private static int[] makeArray () {
		// 配列の長さを保持する変数を初期化する
		int lengthMakeArray = INITIALIZE_ZERO;
		// 配列を作成することをメッセージで出力する
		System.out.println(MESSAGE_MAKE_ARRAY);
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
		// 作成された配列の要素を出力する
		printArrayElement(makedArray);
		// 作成された配列を返す
		return makedArray;
	}
	
	/*** メソッド ******************************/
	// 配列の全要素を出力するメソッドを設定する
	private static void printArrayElement (int[] targetArray) {
		// 配列の長さを保持する変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		// 配列の要素を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_ELEMENT);
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
	// 配列に要素を挿入するメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 追加場所のインデックスを設定するための変数を初期化する
		int insertionIndex = INITIALIZE_ZERO;
		// 対象の配列の長さを保持する変数を初期化する
		int lengthTargetArray = INITIALIZE_ZERO;
		// 対象の配列の最後のインデックスを保持する変数を初期化する
		int lastIndex = INITIALIZE_ZERO;

		/*** 内容出力処理 ******************************/
		// これから行う処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** 配列の作成 ******************************/
		// 対象の配列を作成する
		int[] targetArray = makeArray();


		/*** 配列情報取得 ******************************/
		// 対象の配列の長さを取得する
		lengthTargetArray = targetArray.length;
		// 対象の配列の最後のインデックスを設定する
		lastIndex = lengthTargetArray + NUMBER_FORMATING_LAST_INDEX;

		/*** 要素の挿入 ******************************/
		// 挿入箇所の入力と判定を行う
		do {
			// 要素を挿入するインデックスの入力を求めるメッセージを出力する
			System.out.printf(FORMAT_REQUEST_INSERT_INDEX,lastIndex);
			// 入力されたインデックスの値を保持する
			insertionIndex = scannerInput.nextInt();
		// 入力された値が存在しないインデックスの場合は再入力を求める
		} while ( insertionIndex > lastIndex || insertionIndex < 0);
		// 配列に挿入する値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_INSERT_VALUE);
		// 入力された値を保持する
		int addElement = scannerInput.nextInt();
		// 指定したインデックスに指定した値を挿入する
		aryIns(targetArray, insertionIndex, addElement);

		/*** 要素の出力 ******************************/
		// 対象の配列の要素を出力する
		printArrayElement(targetArray);

		/*** 終了処理 ******************************/
		// 入力用ストリームを閉じる
		scannerInput.close();
	}
}
