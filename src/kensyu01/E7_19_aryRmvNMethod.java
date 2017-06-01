package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;


/*** クラス ******************************/
// 配列から指定した要素を先頭とする範囲までの要素の値を削除するメソッドを実行するクラス
public class E7_19_aryRmvNMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	private static final int NUMBER_FORMATING_INDEX = -1;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "配列から指定した要素を先頭とする範囲までの要素の値を削除します";
	// 対象の配列を作成することを示すメッセージを設定する
	private static final String MESSAGE_MAKE_ARRAY = "対象となる配列を作成します";
	// 配列の長さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_ARRAY_LENGTH = "配列の長さを 1 以上の整数値で入力してください : ";
	// 各要素の入力を行うことを示すメッセージを設定する
	private static final String MESSAGE_SETTING_ELEMENT = "各要素の値を設定します";
	// 各要素の入力待ち状態をしめすテキストフォーマットを設定する
	private static final String FORMAT_REQUEST_ELEMENT_VALUE = "[%d] の値を入力 : ";
	// 削除する要素の範囲入力を行うことを示すメッセージを設定する
	private static final String MESSAGE_SETTING_RANGE = "削除する要素の範囲を指定します";
	// 範囲の開始位置入力を求めるメッセージを設定する
	private static final String FORMAT_REQUEST_START_RANGE = "削除する要素範囲の開始位置を 0 ~ %d で指定してください\n";
	// 範囲の長さ入力を求める求めるメッセージを設定する
	private static final String FORMAT_REQUEST_END_RANGE = "削除する要素範囲を 1 ~ %d で指定してください\n";
	// 削除実行後の配列を表示することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_RESULT_ARRAY= "削除実行後の配列を表示します";
	// 配列の表示を行うことを示す文字列を設定する
	private static final String STRING_START_ARRAY = "{ ";
	// 配列の表示を終えることを示す文字列を設定する
	private static final String STRING_END_ARRAY = " }";
	// 各要素を表示する際の区切り文字を設定する
	private static final String ELEMENT_DELIMITER = ", ";
	// 入力が不正であることを示すメッセージを設定する
	private static final String MESSAGE_CAUTION_OUT_RANGE = "指定した範囲で入力してください";

	/*** スキャナー設定 ******************************/
	// 入力を扱うオブジェクトを作成する
	private static Scanner scannerInput = new Scanner(System.in);
	
	/*** メソッド ******************************/
	// 配列から指定した要素を先頭とする範囲までの要素の値を削除するメソッドを設定する
	private static void aryRmvN ( int[] targetArray, int targetStart, int targetRange ) {
		/*** 変数初期化 ******************************/
		// 配列の長さを取得する
		int lengthArray = targetArray.length;
		// 最後のインデックスを設定する
		int lastIndex = lengthArray + NUMBER_FORMATING_INDEX;
		// 指定範囲の終了位置を設定する
		int endRange = lastIndex + targetRange;
		/*** 演算処理 ******************************/
		// 対象範囲の開始位置から終了位置までの要素にアクセスする
		for (int indexCount = targetStart; indexCount < endRange; indexCount++ ){
			// 現在のインデックスから,指定した範囲分先が配列の長さを超えた場合の処理を行う
			if (indexCount + targetRange > lastIndex) {
				// 繰り返し処理を終了する
				break;
			}
			// 現在のインデックスを指定した範囲分先のインデックスの値で上書きする
			targetArray[indexCount] = targetArray[indexCount + targetRange];
		}
	}

	/*** メインメソッド ******************************/
	// 配列から指定した要素を先頭とする範囲までの要素の値を削除するメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 入力された長さを保持するための変数を初期化する
		int lengthTargetArray = INITIALIZE_ZERO;
		// 対象要素の範囲開始位置を保持する変数を初期化する
		int indexStartRange = INITIALIZE_ZERO;
		// 対象要素の範囲の長さを保持する変数を初期化する
		int lengthRange = INITIALIZE_ZERO;

		/*** 内容出力処理 ******************************/
		// 処理内容を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** 入力処理 ******************************/
		// 対象の配列を作成することを示すメッセージを出力する
		System.out.println(MESSAGE_MAKE_ARRAY);
		// 正しい値が入力されるまで処理を繰り返す
		do {
			// 配列の長さ入力を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_ARRAY_LENGTH);
			// 入力された長さを保持する
			lengthTargetArray = scannerInput.nextInt();
		// 0 が入力された場合は処理を繰り返す
		} while ( lengthTargetArray <= 0 );

		/*** 配列作成 ******************************/
		// 保持した長さで配列を作成する
		int[] targetArray = new int[lengthTargetArray];
		// 各要素の入力を行うことを示すメッセージを出力する
		System.out.println(MESSAGE_SETTING_ELEMENT);
		// 配列の各要素にアクセスする
		for (int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ) {
			// 各要素の入力待ち状態をしめすテキストフォーマットを設定する
			System.out.printf(FORMAT_REQUEST_ELEMENT_VALUE, indexCount );
			// 入力された要素の値を保持する
			targetArray[indexCount] = scannerInput.nextInt();
		}
		
		/*** 削除範囲指定 ******************************/
		// 削除する要素の範囲入力を行うことを示すメッセージを設定する
		System.out.println(MESSAGE_SETTING_RANGE);
		// 指定可能な範囲の値を表示する
		System.out.printf(FORMAT_REQUEST_START_RANGE, lengthTargetArray + NUMBER_FORMATING_INDEX);
		// 入力された開始位置を保持する
		indexStartRange = scannerInput.nextInt();
		// 範囲の開始位置に存在しないインデックスが指定された場合の処理を行う
		while ( indexStartRange  >= lengthTargetArray || indexStartRange  < 0 ) {
			// 入力が不正であることを示すメッセージを設定する
			System.out.println(MESSAGE_CAUTION_OUT_RANGE);
			// 指定可能な範囲の値を表示する
			System.out.printf(FORMAT_REQUEST_START_RANGE, lengthTargetArray + NUMBER_FORMATING_INDEX);
			// 入力された値を保持する
			indexStartRange  = scannerInput.nextInt();
		}
		// 範囲の長さ入力を求めるメッセージを設定する
		System.out.printf(FORMAT_REQUEST_END_RANGE, lengthTargetArray - indexStartRange);
		// 入力された範囲の長さを保持する
		lengthRange = scannerInput.nextInt();
		// 範囲の終了位置を設定する
		int endRange = indexStartRange + lengthRange;
		// 開始位置からの範囲の長さの値が配列のインデックスの長さを超えてしまった場合の処理を行う
		while ( endRange > lengthTargetArray || lengthRange <= 0) {
			// 範囲の長さ入力を求める求めるメッセージを設定する
			System.out.printf(FORMAT_REQUEST_END_RANGE, lengthTargetArray - indexStartRange);
			// 入力された値を保持する
			lengthRange = scannerInput.nextInt();
			// 範囲の終了位置を更新する
			endRange = indexStartRange  + lengthRange;
		}
		/*** aryRmvNメソッド実行 ******************************/
		// 配列要素の削除を実行する
		aryRmvN(targetArray,indexStartRange,lengthRange);

		/*** 結果出力 ******************************/
		// 削除実行後の配列を表示することを示すメッセージを設定する
		System.out.println(MESSAGE_OUTPUT_RESULT_ARRAY);
		// 配列の表示を行うことを示す文字列を設定する
		System.out.print(STRING_START_ARRAY);
		// 対象配列の各要素にアクセスする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ) {
			// 初回を除き、区切り文字を出力する
			if ( indexCount != 0 ) {
				// 区切り文字を出力する
				System.out.print(ELEMENT_DELIMITER);
			}
			// 各要素の値を出力する
			System.out.print(targetArray[indexCount]);
		}
		// 配列の表示を終えることを示す文字列を設定する
		System.out.println(STRING_END_ARRAY);

		/*** 終了処理 ******************************/
		// 入力ストリームを閉じる
		scannerInput.close();
	}
}
