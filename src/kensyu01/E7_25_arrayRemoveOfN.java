package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 対象の配列から指定した範囲の要素を削除した配列を作成し、出力するクラス
public class E7_25_arrayRemoveOfN {
	
	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の長さを、配列の最後のインデックスに変換する値を設定する
	private static final int NUMBER_FORMATING_LAST_INDEX = -1;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "対象の配列から指定した範囲の要素を削除した配列を作成し、出力します";
	// 削除範囲の指定を行うことを示すメッセージを設定する
	private static final String MESSAGE_REQUEST_DELETE_RANGE = "削除範囲の指定を行います";
	// 削除範囲の開始位置入力を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_START_RANGE = "削除範囲の開始位置となるインデックスを 0 ~ %d で指定してください\n";
	// 削除範囲の長さ入力を求めるメッセージを設定する
	private static final String FORMAT_REQUEST_LENGTH_RANGE = "削除範囲の長さを 1 ~ %d で指定してください\n";
	// 削除対象の元となる配列を出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_ORIGIN_ARRAY = "削除対象の元となる配列を出力する";
	// 要素の削除を行った配列を出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_DELETED_ARRAY = "要素の削除を行った配列を出力する";

	/*** スキャナー作成 ******************************/
	// 入力を扱うオブジェクトを作成する
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
	
	/*** メソッド makeArray ******************************/
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

	/*** メソッド cloneArray ******************************/
	// 配列を複製して返すメソッドを設定する
	private static int[] cloneArray (int[] targetArray) {
		/*** 変数初期化 ******************************/
		// 対象配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		/*** オブジェクト作成 ******************************/
		// 対象配列と同じ長さの配列を作成する
		int[] clonedArray = makeArraySetLength(lengthTargetArray);
		/*** 処理 ******************************/
		if ( clonedArray != null ) {
			// 作成した配列に対象配列の要素をコピーする
			for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ){
				// 各要素をコピーする
				clonedArray[indexCount] = targetArray[indexCount];
			}
		}
		/*** 終了処理 ******************************/
		// 複製した配列を返す
		return clonedArray;
	}	
	
	/*** メソッド makeArraySetLength ******************************/
	private static int[] makeArraySetLength (int lengthArray ) {
		/*** 変数初期化 ******************************/
		int[] initializeArray;		// 配列を保持する変数を宣言する
		/*** 処理 ******************************/
		// 設定された長さが 0 より大きい場合の処理を行う
		if (lengthArray > 0) {
			// インデックスをまとめるために検索マッチ件数分の長さの配列を作成する
			initializeArray = new int[lengthArray];
		// 設定された長さが 0 以下だった場合の処理を行う
		} else {
			// 配列ではなく null を設定する
			initializeArray = null;
		}
		// 長さを設定した配列 か null を返す
		return initializeArray;
	}

	/*** メソッド printArrayElement ******************************/
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
	
	/*** メソッド arrayRmvOf ******************************/
	// 配列の対象範囲の要素を削除した配列を返すメソッドを設定する
	private static int[] arrayRmvOf (int[] targetArray, int startTargetRange, int lengthTargetRange) {
		/*** 変数設定 ******************************/
		// 対象配列の長さを設定する
		int lengthTargetArray = targetArray.length;
		// 対象配列の最後のインデックスを設定する
		int lastIndexTarget = lengthTargetArray + NUMBER_FORMATING_LAST_INDEX;
		/*** オブジェクト作成 ******************************/
		// 配列を複製する
		int[] arrayDeletedElement = cloneArray(targetArray);
		/*** 処理 ******************************/
		// 対象範囲の開始位置から順にアクセスする
		for (int indexCount = startTargetRange; indexCount < lengthTargetArray; indexCount++ ){
			// 現在のインデックスから,指定した範囲分先が配列の長さを超えた場合の処理を行う
			if (indexCount + lengthTargetRange > lastIndexTarget) {
				// 繰り返し処理を終了する
				break;
			}
			// 現在のインデックスを指定した範囲分先のインデックスの値で上書きする
			arrayDeletedElement[indexCount] = targetArray[indexCount + lengthTargetRange];
		}
		/*** 終了処理 ******************************/
		return arrayDeletedElement;
	}

	/*** メインメソッド ******************************/
	// 対象の配列から指定した範囲の要素を削除した配列を作成し、出力する処理を行う
	public static void main (String[] arg) {
		/*** 変数宣言 ******************************/
		int lengthTargetArray;		// 対象配列の長さを取得するための変数を宣言する
		int lastindexTarget;		// 対象配列の最後のインデックスを取得するための変数を宣言する
		int startTargetRange;		// 入力された削除開始位置を保持するための変数を宣言する
		int lengthTargetRange;		// 削除範囲の長さを保持するための変数を宣言する
		int limitLengthRange;		// 削除範囲の長さの限界を設定するための変数を初期化する 

		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** オブジェクト作成 ******************************/
		// 対象となる配列を作成する
		int[] targetArray = makeArray();

		/*** 変数設定 ******************************/
		// 対象配列の長さを取得する
		lengthTargetArray = targetArray.length;
		// 対象配列の最後のインデックスを取得する
		lastindexTarget = lengthTargetArray + NUMBER_FORMATING_LAST_INDEX;

		/*** 入力処理 ******************************/
		// 削除対象の範囲入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_DELETE_RANGE);
		// 範囲内の入力を行う
		do {
			// 削除範囲開始位置入力を求めるメッセージを出力する
			System.out.printf(FORMAT_REQUEST_START_RANGE, lastindexTarget);
			// 入力された削除開始位置を保持する
			startTargetRange = scannerInput.nextInt();
		// 入力が範囲外なら繰り返す
		} while (startTargetRange < 0 || startTargetRange > lastindexTarget);
		// 削除範囲の長さ入力の限界を設定する
		limitLengthRange = lengthTargetArray - startTargetRange;
		// 範囲内の入力を行う
		do {
			// 削除範囲の長さ入力を求めるメッセージを出力する
			System.out.printf(FORMAT_REQUEST_LENGTH_RANGE, limitLengthRange);
			// 入力された削除範囲の長さを保持する
			lengthTargetRange = scannerInput.nextInt();
		// 入力が範囲外なら繰り返す
		} while (lengthTargetRange <= 0 || lengthTargetRange > limitLengthRange);

		/*** arrayRmvOfNメソッド実行 ******************************/
		// 対象配列から対象範囲の要素を削除した配列を作成し保持する
		int[] arrayElementDeleted = arrayRmvOf(targetArray, startTargetRange, lengthTargetRange);

		/*** 出力処理 ******************************/
		// 削除対象の配列要素を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_ORIGIN_ARRAY);
		// 削除対象の配列要素を出力する
		printArrayElement(targetArray);
		// 削除を行った配列要素を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_DELETED_ARRAY);
		// 削除を行った配列要素を出力する
		printArrayElement(arrayElementDeleted);

		/*** 終了処理 ******************************/
		// 入力用ストリームを閉じる
		scannerInput.close();
	}

}
