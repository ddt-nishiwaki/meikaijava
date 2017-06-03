package kensyu01;

/*** ライブラリの読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
//配列から対象要素を削除して返すメソッドを実行するクラス
public class E7_24_arrayRmvOfMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の長さを配列の最後のインデックスに変換する値を設定する
	private static final int FORMATING_LAST_INDEX = -1;
	// 配列操作時のカウントを次のカウントに変換するための値を設定する
	private static final int FORMATING_NEXT_INDEX = 1;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "対象配列から対象要素を削除した配列を作成し、出力します";
	// 削除を行なった後の配列要素を出力することを示すメッセージを出力する
	private static final String MESSAGE_OUTPUT_RESULT_DELETE = "削除後の配列要素を出力します";
	// 削除を行うインデックスの入力を求めるメッセージを出力する
	private static final String MESSAGE_REQUEST_TARGET_INDEX = "削除を行うインデックスを 0 ~ %d で入力してください";

	/*** スキャナー作成 ******************************/
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
	
	/*** メソッド ******************************/
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

	/*** メソッド ******************************/
	//配列から対象要素を削除して返すメソッドを設定する
	private static int[] arrayRmvOf ( int[] targetArray, int targetDeleteIndex ) {
		/*** 変数宣言 ******************************/
		// 対象配列から対象要素を削除した配列を保持する変数を初期化する
		int[] arrayDeletedElement;
		/*** 配列複製 ******************************/
		arrayDeletedElement = cloneArray(targetArray);
		/*** 変数初期化 ******************************/
		// 対象配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		// 対象配列の最後のインデックスを設定する
		int lastIndex = lengthTargetArray + FORMATING_LAST_INDEX; 
		/*** 処理 ******************************/
		// 削除対象のインデックスから最後のインデックス手前まで順にアクセスする
		for ( int indexCount = targetDeleteIndex; indexCount < lastIndex; indexCount++ ) {
			// 現在のインデックスの値を次のインデックスの値で上書きする
			arrayDeletedElement[ indexCount ] = targetArray[ indexCount + FORMATING_NEXT_INDEX ];
		}
		/*** 終了処理 ******************************/
		return arrayDeletedElement;
	}
	
	/*** メインメソッド ******************************/
	//配列から対象要素を削除して返すメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数宣言 ******************************/
		int[] targetArray;			// 削除実行の対象となる配列を取得するための変数を初期化する
		int[] arrayRemovedTarget;	// 削除を実行した配列を取得するための変数を初期化する
		int targetDeleteIndex;		// 削除対象となるインデックスを取得するための変数を初期化する

		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** オブジェクト作成 ******************************/
		// 対象配列を作成する
		targetArray = makeArray();

		/*** 配列編集 ******************************/
		// 対象配列の最後のインデックスを取得する
		int lastIndexTarget = targetArray.length + FORMATING_LAST_INDEX;
		// 対象範囲内の入力を求める
		do {
			// 削除対象のインデックス入力を求める
			System.out.printf(MESSAGE_REQUEST_TARGET_INDEX,lastIndexTarget);
			// 削除対象となるインデックスを保持する
			targetDeleteIndex = scannerInput.nextInt();
		// 範囲内の入力が行われるまで繰り返す
		} while ( targetDeleteIndex < 0 || targetDeleteIndex > lastIndexTarget );
		// 削除を実行した配列を取得する
		arrayRemovedTarget = arrayRmvOf(targetArray, targetDeleteIndex);

		/*** 出力処理 ******************************/
		// 削除後の配列要素の値を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_RESULT_DELETE);
		// 削除後の配列要素の値を出力する
		printArrayElement(arrayRemovedTarget);

		/*** 終了処理 ******************************/
		// 入力ストリームを閉じる
		scannerInput.close();
	}
}