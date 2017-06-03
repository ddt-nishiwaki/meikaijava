package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 配列の要素を検索し、そのインデックスをまとめた配列を作成するクラス
public class E7_23_SearchIndexMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "配列要素から特定の値を検索し、マッチした要素のインデックスを新たな配列にまとめます。";
	// 検索する要素の値の入力を求めるメッセージの出力する
	private static final String MESSAGE_REQUEST_SEARCH_ELEMENT = "検索する要素の値を設定してください";
	// 検索した結果をまとめた配列を出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_RESULT_SEARCH = "検索結果をまとめた配列を表示します";
	// 検索結果がない場合のメッセージを設定する
	private static final String MESSAGE_ELEMENT_NOT_FOUND = "入力した要素は見つかりませんでした";

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
	
	/*** オブジェクト作成 ******************************/
	private static Scanner scannerInput = new Scanner(System.in);
	
	/*** メソッド ******************************/
	// 配列要素から特定の値がいくつあるかを検索し、マッチした件数を返すメソッドを設定する
	private static int searchArrayCount (int[] targetArray, int searchElement) {
		// 検索マッチ件数のカウンターを初期化する
		int countSortMatch = INITIALIZE_ZERO;
		// 検索対象の配列長を取得する
		int lengthTargetArray = targetArray.length;
		// 対象配列の各インデックスにアクセスする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ) {
			// 各要素の値が検索する値と一致した場合の処理を行う
			if (targetArray[indexCount] == searchElement) {
				// 検索マッチ件数をカウントする
				countSortMatch++;
			}
		}
		// 検索マッチ件数を返す
		return countSortMatch;
	}

	/*** メソッド setLengthArray ******************************/
	private static int[] setLengthArray (int lengthArray ) {
		// 配列を保持する変数を宣言する
		int[] initializeArray;
		// 設定された長さが 0 より大きい場合の処理を行う
		if (lengthArray > 0) {
			// インデックスをまとめるために検索マッチ件数分の長さの配列を作成する
			initializeArray = new int[lengthArray];
		// 設定された長さが 0 以下だった場合の処理を行う
		} else {
			// 配列ではなく null を設定する
			initializeArray = null;
		}
		// 長さを設定した配列を返す
		return initializeArray;
	}

	/*** メソッド arraySrchIdx ******************************/
	// 配列の要素を検索し、そのインデックスをまとめた配列を作成するメソッドを設定する
	private static int[] arraySrchIdx (int[] targetArray, int searchElement) {
		/*** 変数宣言 ******************************/
		int[] matchIndexesArray;	 // 検索結果を保持する配列　を保持するための変数を宣言する
		/*** 変数初期化 ******************************/
		// 対象配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		// 検索マッチ件数をカウントする変数を初期化する
		int countSortMatch = INITIALIZE_ZERO;
		/*** 配列検索 ******************************/
		// 検索マッチした件数を取得する
		countSortMatch = searchArrayCount(targetArray, searchElement);
		/*** オブジェクトの作成 ******************************/
		// マッチした検索分の長さを持つ配列を作成する
		matchIndexesArray = setLengthArray(countSortMatch);
		/*** 判定後の処理 ******************************/
		// 検索マッチ件数をカウントする変数を初期化する
		int matchIndexesCount = INITIALIZE_ZERO;
		// 対象配列の各インデックスにアクセスする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ) {
			// 検索結果がない場合の処理を行う
			if (matchIndexesArray == null){
				// 繰り返し処理を終了する
				break;
			}
			// 各要素の値が検索する値と一致した場合の処理を行う
			if (targetArray[indexCount] == searchElement) {
				// インデックスをまとめるための配列に現在のインデックスを設定する
				matchIndexesArray[matchIndexesCount++] = indexCount;
			}
		}
		/*** 終了処理 ******************************/
		// 検索マッチしたインデックスをまとめた配列を返す
		return matchIndexesArray;
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
	
	/*** メインメソッド ******************************/
	// 配列の要素を検索し、そのインデックスをまとめた配列を作成するメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 入力された検索対象を保持する変数を初期化する
		int searchElement = INITIALIZE_ZERO;
		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		/*** オブジェクト作成 ******************************/
		// 対象の配列を作成する
		int[] targetArray = makeArray();
		/*** 検索処理 ******************************/
		// 検索する値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_SEARCH_ELEMENT);
		// 入力された検索対象を保持する
		searchElement = scannerInput.nextInt();
		// 対象の配列要素から検索する値が存在するインデックスを検索して別の配列にまとめる
		int[] resultSearchIndexes = arraySrchIdx(targetArray, searchElement);
		/*** 終了処理 ******************************/
		// 検索結果が存在する場合の処理を行う
		if( resultSearchIndexes != null ) {
			// 検索結果を出力することをメッセージで出力する
			System.out.println(MESSAGE_OUTPUT_RESULT_SEARCH);
			// 対象の値が存在したインデックスをまとめた配列要素を出力する
			printArrayElement(resultSearchIndexes);
		// 検索結果がない場合の処理を行う
		} else {
			// 検索結果がないことをメッセージで出力する
			System.out.println(MESSAGE_ELEMENT_NOT_FOUND);
		}
	}
}
