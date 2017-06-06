package kensyu01;

/*
 * 範囲外入力をした際のメッセージがない
 */

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 対象の配列から指定した範囲の要素を削除した配列を作成し、出力するクラス
public class E7_26_arrayInsOfMethod {
	
	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の長さを、配列の最後のインデックスに変換する値を設定する
	private static final int NUMBER_FORMATING_LAST_INDEX = -1;
	// 配列操作時のカウントを前のカウントに変換するための値を設定する
	private static final int NUMBER_FORMATING_PREVIOUS_INDEX = -1;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "対象の配列に指定した要素を追加した配列を作成し、出力します";
	// 追加場所のインデックス入力を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_INSERTION_POINT = "追加場所となるインデックスを 0 ~ %d で指定してください\n";
	// 追加する要素の値入力を求めるメッセージを出力する
	private static final String MESSAGE_REQEST_ELEMENT_VALUE = "追加する要素の値を入力してください";
	// 追加対象の元となる配列を出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_ORIGIN_ARRAY = "追加対象の元となる配列を出力する";
	// 要素の追加を行った配列を出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_INSERT_ARRAY = "要素の追加を行った配列を出力する";

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
	
	/*** メソッド ******************************/
	// 配列に要素を挿入するメソッド
	private static int[] arrayInsOf (int[] targetArray, int targetIndex, int addElement) {
		/*** 変数初期化 ******************************/
		// 配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		// 配列の最後のインデックスを設定する
		int lastIndex = lengthTargetArray + NUMBER_FORMATING_LAST_INDEX;
		/*** 配列複製 ******************************/
		int[] arrayInsertedElement = cloneArray(targetArray);
		/*** 処理 ******************************/
		// 配列の対象のインデックスまで後方のインデックスからアクセスする
		for ( int indexCount = lastIndex; indexCount >= targetIndex; indexCount-- ) {
			// 前方のインデックスにアクセスする値を設定する
			int prevIndex = indexCount + NUMBER_FORMATING_PREVIOUS_INDEX;
			// 対象のインデックスの場合は追加する値を設定する
			if (indexCount == targetIndex){
				// 要素を挿入する
				arrayInsertedElement[indexCount] = addElement;
				// 繰り返し処理を抜ける
				break;
			}
			// 現在のインデックスを前方のインデックスで上書きする
			arrayInsertedElement[indexCount] = targetArray[prevIndex];
		};
		// 要素を追加した配列を返す
		return arrayInsertedElement;
	}
	
	/*** メインメソッド ******************************/
	// 対象の配列から指定した範囲の要素を削除した配列を作成し、出力する処理を行う
	public static void main (String[] arg) {
		/*** 変数宣言 ******************************/
		int lengthTargetArray;		// 対象配列の長さを取得するための変数を宣言する
		int lastIndexTarget;		// 対象配列の最後のインデックスを取得するための変数を宣言する
		int indexInsertionPoint;	// 挿入箇所となるインデックスを設定するための変数を宣言する
		int insertNumber;			// 挿入する値を設定する変数を宣言する

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
		lastIndexTarget = lengthTargetArray + NUMBER_FORMATING_LAST_INDEX;

		/*** 入力処理 ******************************/
		do {
			// 挿入を行うインデックスの入力を求めるメッセージを出力する
			System.out.printf(FORMAT_REQUEST_INSERTION_POINT,lastIndexTarget);
			// 入力された挿入箇所を保持する
			indexInsertionPoint = scannerInput.nextInt();
		// 存在しないインデックスが指定されている場合は繰り返す
		} while(indexInsertionPoint < 0 || indexInsertionPoint > lastIndexTarget);
		// 挿入する値の入力を求めるメッセージを出力する
		System.out.printf(MESSAGE_REQEST_ELEMENT_VALUE);
		// 入力された値を保持する
		insertNumber = scannerInput.nextInt();
		
		/*** arrayInsOfメソッド実行 ******************************/
		int[] arrayElementInserted = arrayInsOf(targetArray,indexInsertionPoint,insertNumber);

		/*** 出力処理 ******************************/
		// 追加対象元の配列要素を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_ORIGIN_ARRAY);
		// 追加対象元の配列要素を出力する
		printArrayElement(targetArray);
		// 追加を行った配列要素を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_INSERT_ARRAY);
		// 追加を行った配列要素を出力する
		printArrayElement(arrayElementInserted);

		/*** 終了処理 ******************************/
		// 入力用ストリームを閉じる
		scannerInput.close();
	}

}
